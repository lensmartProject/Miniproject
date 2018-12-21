package com.mayuri.CRUDoperation.LoginspringJDBC.EmployeeDAO;

import com.mayuri.CRUDoperation.LoginspringJDBC.Employee.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {

	private JdbcTemplate jdbcTemplate;  
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	}  
	
	public int saveEmployee(Employee e){  
	    String query="insert into productdetails values('"+e.getId()+"','"+e.getName()+"','"+e.getPrice()+"','"+e.getDescription()+"')";  
	    return jdbcTemplate.update(query);  
	}  
}
