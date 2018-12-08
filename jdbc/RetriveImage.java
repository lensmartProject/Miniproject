package com.vijay.jdbc;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveImage {

	public static void main(String[] args) {
		 Connection con=null;
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","orcl11g"); 
			      
			PreparedStatement ps=con.prepareStatement("select * from image");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){//now on 1st row  
			              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fout=new FileOutputStream("d:\\sonoo.jpg");  
			fout.write(barr);  
			              
			fout.close();  
			}//end of if  
			System.out.println("ok");  
			              
			con.close();  
			}catch (Exception e) {e.printStackTrace();  }  
	
	}
}
