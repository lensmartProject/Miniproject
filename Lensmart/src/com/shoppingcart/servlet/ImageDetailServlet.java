package com.shoppingcart.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.lensmart.ImageDetailsPojo;
import com.capgemini.lensmart.UserDAOImpl;


@WebServlet("/imageDetailServlet")
public class ImageDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ImageDetailServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
		  Connection con = UserDAOImpl.getConnection();
		  PreparedStatement ps=con.prepareStatement("insert into imgsample values(?,?)");  
			ps.setString(1,"vijay");  
			  
			FileInputStream fin=new FileInputStream("C:\\mayuri\\java\\Lensmart\\WebContent\\images\\specs.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  
		
		
	}


