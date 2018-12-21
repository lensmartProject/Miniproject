package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.project.pojo.User;

public class UserMapper {

	public User mapRow(ResultSet rs, int arg1) throws SQLException {
		 User user = new User();
		    user.setEmailId(rs.getString("emailId"));
		    user.setUserId(rs.getInt("userId"));
		    user.setName(rs.getString("name"));
		    user.setPhoneNo(rs.getInt("phoneNo"));
		    user.setPassword(rs.getString("password"));
		   
		    return user;
		  }
	
}
