package com.capgemini.lensmart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.HttpServletResponse;

import com.shoppingcart.servlet.RegistrationDetailServlet;

public class UserDAOImpl implements IUserDAO {
	static Connection connection;
	
	
	public  String userVerify(UserDetailsPojo detailsPojo) {
	
	try{
		getConnection();
		PreparedStatement statement=connection.prepareStatement("insert into LensmartRegistration values(?,?,?,?,?,?,?)");
		
		statement.setString(1,detailsPojo.getFullName());
		statement.setString(2, detailsPojo.getUserName());
		statement.setString(3,detailsPojo.getPassword());
		statement.setString(4,detailsPojo.getConfirmPassword());
		statement.setInt(5,detailsPojo.getMobileNum());
		statement.setString(6,detailsPojo.getEmailId());
		statement.setString(7,detailsPojo.getAddress());
		
		statement.executeUpdate();
		
		System.out.println("inserted successfully");
		
		statement.close();
	
		}catch(SQLException e){
			e.printStackTrace();
		}

			return null;
		}

	public static Connection getConnection() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g");
			
		}catch(SQLException e){
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	}
	

