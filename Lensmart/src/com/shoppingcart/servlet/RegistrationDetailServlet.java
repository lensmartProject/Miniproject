package com.shoppingcart.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.lensmart.UserDAOImpl;
import com.capgemini.lensmart.UserDetailsPojo;


@WebServlet("/registrationDetailServlet")
public class RegistrationDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationDetailServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("welcome");
		
		 response.setContentType("text/html");
		 
		String fullName=request.getParameter("fullname");
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmpassword");
		int mobileNum=Integer.parseInt(request.getParameter("mobilenumber"));
		String emailId=request.getParameter("emailid");
		String address=request.getParameter("address");
		
		UserDAOImpl u=new UserDAOImpl();
		u.userVerify(new UserDetailsPojo(fullName,userName,password,confirmPassword,mobileNum,emailId,address));
		
	
	}

	
}

