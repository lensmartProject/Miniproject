package com.vijay.lensmart.shoppingProduct;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestProduct {
	public static void main(String[] args) {  
	    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
	    ProductDao dao=(ProductDao)context.getBean("ProductDao"); 
	    
	    dao.add(new Product(159, "Eyeglasses", 50, "Beverage")); 
	    dao.add(new Product(753, "Frameless", 60, "Beverage"));
	    dao.remove(321);
	   dao.add(new Product(300, "Withclassyframe", 552, "Thanda"));
	    dao.add(new Product(148, "spectacle", 50, "Beverage"));
	    dao.getAll();
	    dao.get(159);
	   
	    List<Product> list=dao.getAll();  
	          
	    for(Product product:list)  
	        System.out.println(product);
	    
	    dao.contains(153);
	    
	}  
}
