package com.medplus.assetmanagementcore.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.medplus.assetmanagementcore.model.Employee;

public interface EmployeeDao {
	public int insertEmployee(Employee employee,String createdBy,Date createdDate);
	public int updateEmployeeInfo(Employee employee,String updatedBy,Date updatedDate);
	public Employee getEmployee(String empId);
	
	public List<Employee> getEmployees();
	
	public List<Employee> getEmployeeByRole(String role);
	
	public String getEmployeePassword(String empId);
	
	public int addRole(int roleId, String roleName, String addedBy,Date addedDate);
	
	public int addRoleToEmp(String empId,List<Long> roleIdList, String addedBy,Date addedDate);
	
	public Map<Integer,String> getRole(String empid);
	
	public Map<Integer,String> getAllRoles();
	
	public long getRoleId(String roleName);
	
	public int removeRole(String empid,String removedBy,Date removedDate);
	
	public int updatePassword(String empId,String changedBy,String updatedDate,String oldPassword,String newPassword);
	
	
	public boolean resetPassword(String empId,String changedBy,String updatedDate,String newPassword);
	
	
}
	

