package com.medplus.assetmanagement.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.medplus.assetmanagementcore.dao.impl.EmployeeDaoImpl;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.service.impl.EmployeeServiceImpl;
import com.medplus.assetmanagementcore.utils.AppConfig;
import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.AssetTypeEnum;
import com.medplus.assetmanagementcore.utils.Gender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class EmployeeTest {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
	@Autowired
	EmployeeDaoImpl dao;
	/*@Test
	public void testUpdateEmployee()
	{
		Employee employee=new Employee();
		employee.setFirstName("niha");
		employee.setGender(Gender.f);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setEmployeeId("13");
		String expectedResult = "SUCCESS";
		String msg=employeeServiceImpl.updateEmployee(employee,"13", new Date());
		assertEquals(expectedResult,msg);
	}
	@Test
	public void testGetEmployeesSuccess() {
		Employee emp=new Employee();

		
		assertEquals(dao.getEmployees().getClass(), employeeServiceImpl.getAllEmployees().getClass());
	}
	@Test
	public void testAddRoleSuccess() {
	
		String expectedResult = "SUCCESS";
		assertEquals(expectedResult,employeeServiceImpl.addRole(107,"emp","13",new java.sql.Date(new Date().getTime())));

	}*/
	@Test
	public void addRoleToEmpSuccess()
	{
		
		List<String> li=new ArrayList<String>();
		li.add("admin");
		li.add("edp");
		System.out.println("nvbmcnbzxdm,");
		/*assertEquals("SUCCESS",employeeServiceImpl.addRoleToEmp("16", li,"13",new java.sql.Date(new Date().getTime())));*/
	}
}
