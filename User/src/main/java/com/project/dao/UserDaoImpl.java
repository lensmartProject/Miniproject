package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.project.pojo.User;

public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int add(User user) {
			String query = "insert into userdetails values('" + user.getEmailId()
				+ "','" +user.getUserId() + "','"
				+ user.getName() + "','"
				+ user.getPhoneNo() + "','"+user.getPassword()+"')";
		return jdbcTemplate.update(query);
	}

	public int remove(int userId) {
		String query = "delete from userdetails where userId='"
				+ userId + "' ";
		return jdbcTemplate.update(query);
	}

	public int update(User user) {
		String query = "update userdetails set emailId='"
				+ user.getEmailId() + "', name='"+user.getName()+"' where userId='"
				+ user.getUserId() + "' ";
		return jdbcTemplate.update(query);
	}
	
	

	public List<User> getAll() {
		return jdbcTemplate.query("select * from userdetails",
				new ResultSetExtractor<List<User>>() {
					public List<User> extractData(ResultSet rs)
							throws SQLException, DataAccessException {

						List<User> list = new ArrayList<User>();
						while (rs.next()) {
							User user = new User();
							/*user.setEmailId(rs.getString("pooji@gmail.com"));
							user.setUserId(rs.getInt("121"));
							user.setName(rs.getString("poojitha"));
							user.setPhoneNo(rs.getInt("123456"));
							user.setPassword(rs.getString("abc"));*/
							user.setEmailId(rs.getString("emailId"));
							user.setUserId(rs.getInt("userId"));
							user.setName(rs.getString("name"));
							user.setPhoneNo(rs.getInt("phoneNo"));
							user.setPassword(rs.getString("password"));
							list.add(user);
						}
						return list;
					}

				});
	}
		
	
}

