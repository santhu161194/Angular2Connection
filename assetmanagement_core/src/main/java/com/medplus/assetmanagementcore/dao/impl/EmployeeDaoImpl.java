package com.medplus.assetmanagementcore.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.medplus.assetmanagementcore.dao.EmployeeDao;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.utils.Gender;
import com.medplus.assetmanagementcore.utils.Queries;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	Connection conn;
	PreparedStatement pst;
	
    @Autowired
	private JdbcTemplate template;
    @Autowired
    Employee employee;
	@Override
	public int insertEmployee(Employee employee, String createdBy,
			Date createdDate) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updateEmployeeInfo(final Employee employee, final String updatedBy,
			final Date updatedDate) {
		int rows=template.update(Queries.updateEmployee,new PreparedStatementSetter() {
				
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				
				pst.setString(1, employee.getFirstName());
				pst.setString(2, employee.getLastName());
				
				pst.setString(3, employee.getGender().toString());
				pst.setLong(4, employee.getMobileNumber());
				pst.setDate(5, new java.sql.Date(employee
						.getDateOfJoin().getTime()));
				pst.setDate(6, new java.sql.Date(employee
						.getDateOfBirth().getTime()));
				
	
				pst.setString(7, employee.getAddress());
				pst.setDouble(8,employee.getSalary());
				pst.setString(9,updatedBy);
				pst.setDate(10, new java.sql.Date(updatedDate.getTime()));
				pst.setString(11,employee.getEmployeeId());
				
				
			}
		});
		
			
		return rows;
		
	}
		
	
	@Override
	public Employee getEmployee(String empId) {
		String sql = Queries.GET_EMPLOYEE;
		Object args[] = { empId };
		Employee empl = template.queryForObject(sql, args,
				new BeanPropertyRowMapper<Employee>(Employee.class));
		return empl;
	}
	
	@Override
	public List<Employee> getEmployees() {
		@SuppressWarnings("unchecked")
		List<Employee> emplist=template.query(Queries.getAllEmployees,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int arg1) throws SQLException {
				Employee emp=new Employee();
				emp.setEmployeeId(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				/*emp.setPassword(rs.getString(4));*/
				
				emp.setGender(Gender.valueOf(rs.getString(4)));
				emp.setMobileNumber(rs.getLong(5));
				emp.setDateOfJoin(rs.getDate(6));
				emp.setDateOfBirth(rs.getDate(7));
				emp.setAddress(rs.getString(8));
				emp.setSalary(rs.getDouble(9));
				
				
				return emp;
			}
		});
		return emplist;
		
	}
	@Override
	public List<Employee> getEmployeeByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getEmployeePassword(String empId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Map<Integer, String> getRole(String empid) {
		
		return null;
	}
	

		/*Object args[]={roleName};
		try {
			return template.queryForObject(Queries.getRoleId, args,new BeanPropertyRowMapper<int>(int.class));
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		
	
	@Override
	public int removeRole(String empid, String removedBy, Date removedDate) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int updatePassword(String empId, String changedBy,
			String updatedDate, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean resetPassword(String empId, String changedBy,
			String updatedDate, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int addRole(final int roleId,final String roleName, final String addedBy,
			final Date addedDate) {
		int rows=template.update(Queries.addRole,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement pst) throws SQLException {
				
				pst.setInt(1,roleId);
				pst.setString(2,roleName);
				pst.setString(3,addedBy);
				pst.setDate(4, new java.sql.Date(addedDate.getTime()));
			}
		});
		return rows;
	
	}
	@Override
	public int addRoleToEmp(final String empId, List<Long> roleIdList,
			final String addedBy, final Date addedDate) {
		int rows = 0;
		for(final Long ls : roleIdList) {
			rows = template.update(Queries.addRoleToEmp,new PreparedStatementSetter() {
		
				@Override
				public void setValues(PreparedStatement pst) throws SQLException {
					
					pst.setString(1,empId);
					pst.setLong(2,ls.longValue());
					pst.setString(3, addedBy);
					pst.setDate(4,new java.sql.Date(addedDate.getTime()));
					
				}
			});
		}
		
		return rows;
	}
	@Override
	public Map<Integer, String> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long getRoleId(String roleName) {
		
			String sql = Queries.getRoleId;
			Object args[] = {roleName };
			int r= template.queryForObject(sql, args,(Integer.class));
			
			return r;
		
	}
	
	
	
	
	/*public int getRoleName(int roleId) {
		String sql = Queries.getRoleId;
		Object args[] = {roleName };
		int r= template.queryForObject(sql, args,(Integer.class));
		
		return r;
		
	}*/
	}

