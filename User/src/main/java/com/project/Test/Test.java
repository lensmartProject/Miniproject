package com.project.Test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.dao.UserDaoImpl;
import com.project.pojo.User;

public class Test {
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("User.xml");  
	    UserDaoImpl dao=context.getBean(UserDaoImpl.class); 
	  dao.add(new User("pk@gmail.com", 121, "kavya", 32654, "def")); 
	  
	  dao.add(new User("hi@gmail.com", 122, "rachu", 456789, "hij"));
	  
	  dao.remove(121);
	  
	  dao.update(new User("abc@gmail.com", 122, "rachu", 456789, "hij"));
	   
	  dao.getAll();
	   
	    List<User> list=dao.getAll();  
	          
	    for(User user:list)  
	        System.out.println(user);
	}
}
