package com.shoppingcart.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.lensmart.UserDAOImpl;

/**
 * Servlet implementation class LoginDetailServlet
 */
@WebServlet("/loginDetailServlet")
public class LoginDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public LoginDetailServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
		    String password = request.getParameter("password");
		    /*System.out.println(userName);
		    System.out.println(passWord);*/

		     try
		    {
		        Connection con = UserDAOImpl.getConnection();
		        PreparedStatement statement = con.prepareStatement("select username, password from LensmartRegistration where username =? and password=?");
		        statement.setString(1, "vijay");
		        statement.setString(2, "vijayyy");
		        ResultSet result = statement.executeQuery();
		        while(result.next()){
		    		if(result.getString("userName").equals("vijay") && result.getString("passWord").equals("vijayyy")){
		    			return ;
		    			
		    		}
		    	}
		    	}
		    	catch(SQLException e){
		    		e.printStackTrace();
		    	}
		    		return;
		    	}
		        /*if(result.next()){
		            response.sendRedirect("Home.jsp");
		        }else{
		            System.out.println("username and password are incorrect");
		        }*/
		    /*catch(Exception e){
		        System.out.println("DB related Error");
		        e.printStackTrace();
		    }  */ 
	}


