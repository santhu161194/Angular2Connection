import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.medplus.assetmanagementcore.dao.impl.EmployeeDaoImpl;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.utils.Gender;



public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/medplus/assetmanagementcore/utils/ApplicationContext.xml");
	EmployeeDaoImpl employeeDao=context.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
	Employee employee=context.getBean("employee",Employee.class);
	/*employee.setFirstName("niha");
	employee.setGender(Gender.f);
	employee.setDateOfBirth(new Date());
	employee.setDateOfJoin(new Date());
	employee.setEmployeeId("13");
	int rows=employeeDao.updateEmployeeInfo(employee,"13",new Date());
	if(rows>0)
		System.out.println("updated");
	else
		System.out.println("not updated");
	List<Employee> empl=employeeDao.getEmployees();
	for(Employee emp:empl)
		System.out.println(emp.getEmployeeId()+" "+emp.getDateOfBirth());
		*/
	/*int rows1=employeeDao.addRole(105,"emp","13",new java.sql.Date(new Date().getTime()));
	if(rows1>0)
		System.out.println("added");
	else
		System.out.println("not added");*/
	/*List<Long> li=new ArrayList<Long>();
	li.add((long) 100);
	li.add((long) 101);
	employeeDao.addRoleToEmp("17", li,"13",new java.sql.Date(new Date().getTime()));*/
	long list=employeeDao.getRoleId("admin");
	if(list>0)
	{
	System.out.println(employeeDao.getRoleId("admin"));
}
}
}