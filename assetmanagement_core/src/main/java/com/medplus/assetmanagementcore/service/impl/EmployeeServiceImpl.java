package com.medplus.assetmanagementcore.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.medplus.assetmanagementcore.dao.impl.EmployeeDaoImpl;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
EmployeeDaoImpl employeeDaoImpl;
	@Override
	public String addEmployee(Employee employee, String createdBy,
			Date createdDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(Employee employee, String updatedBy,
			Date updatedDate) {
		
			//employee=employeeDaoImpl.getEmployee(employee.getEmployeeId());
		String msg=null;
		try {
			int rows = employeeDaoImpl.updateEmployeeInfo(employee, updatedBy, updatedDate);
			
			if(rows > 0)
				 msg="SUCCESS";
			else
			msg="FAILURE";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		
		return msg;
		
	}

	@Override
	public Employee getEmployee(String empId) {
		Employee emp = employeeDaoImpl.getEmployee(empId);

		System.out.println(emp.getEmployeeId() + " " + emp.getGender());
		return emp;

	}

	@Override
	public List<Employee> getAllEmployees() {
		String msg=null;
		
				
		List<Employee> rows = employeeDaoImpl.getEmployees();
			
			return rows;
		
	}

	@Override
	public boolean authenticateEmployee(String empid, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	@Override
	public Map<Integer, String> getEmployeeRole(String empid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getAllRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRoleId(String roleName) {
		
		return 0;
	}

	@Override
	public String removeEmployeeRle(String empid, String removedBy,
			Date removedDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changePasswordByUser(String empId, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePasswordByAdmin(String empId, String changedBy,
			String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String addRoleToEmp(String empId, List<Long> roleIdList,
			String addedBy,Date addedDate) {
		
		String msg=null;
		try {
			System.out.println(msg);
			int rows = employeeDaoImpl.addRoleToEmp(empId, roleIdList, addedBy, addedDate);
			if(rows > 0)
				 msg="SUCCESS";
			else
			msg="FAILURE";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		
		return msg;
	}

	@Override
	public String addRole(int roleId, String roleName, String addedBy,
			Date addedDate) {
		
		
			String msg=null;
			try {
				int rows = employeeDaoImpl.addRole(roleId, roleName, addedBy, addedDate);
				
				if(rows > 0)
					 msg="SUCCESS";
				else
				msg="FAILURE";
			} catch (Exception e) {
				System.out.println("sql exception raised");
			}
			
			return msg;
			
	}

}
