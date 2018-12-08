package com.vijay.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ImageStore {
	public static void main(String[] args) {  
		 Connection con=null;
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g"); 
		              
		PreparedStatement ps=con.prepareStatement("insert into image values(?,?)");  
		ps.setString(1,"vijay");  
		  
		FileInputStream fin=new FileInputStream("D:\\specs.jpg");  
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
		          
		con.close();  
		}catch (Exception e) {e.printStackTrace();}  
		}  
}
