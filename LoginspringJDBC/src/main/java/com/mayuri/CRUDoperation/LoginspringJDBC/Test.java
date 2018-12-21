package com.mayuri.CRUDoperation.LoginspringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mayuri.CRUDoperation.LoginspringJDBC.Employee.Employee;
import com.mayuri.CRUDoperation.LoginspringJDBC.EmployeeDAO.EmployeeDAO;

public class Test {

	public static void main(String[] args) {  
	    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
	    dao.saveEmployee(new Employee(1,"Titan square glass frame",4000,"This frame is unbreakable"));  
}
}