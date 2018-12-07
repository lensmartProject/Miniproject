package com.capgemini.lensmart.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp.ConnectionFactory;

 

public class UserDAO{

	
	public String User(String UserName, String Password) {
		Connection connection=ConnectionFactory.getConnection();
		try {
			PreparedStatement statement=connection.prepareStatement("select * from registration  where userName=? and password=?");
		statement.setString(1, UserName);
		statement.setString(2, Password);
		
		ResultSet set=statement.executeQuery();
		while(set.next()){
			if(set.getString("UserName").equals(UserName)&& set.getString("Password").equals(Password)){
				System.out.println("Welcome to Home Page");
			}
		}
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}	
