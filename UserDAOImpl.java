package com.capgemini.lensmart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.lensmart.pojo.UserDetailsPojo;

public class UserDAOImpl implements IUserDAO {

	public String userVerify(UserDetailsPojo detailsPojo) {
		Connection connection = ConnectionFactory.getConnection();
		try {
			PreparedStatement statement = connection
					.prepareStatement("select * from registration  where userName=? and password=?");
			statement.setString(1, detailsPojo.getUserName());
			statement.setString(2, detailsPojo.getPassword());

			ResultSet set = statement.executeQuery();
			while (set.next()) {
				if (set.getString("UserName").equals(detailsPojo.getUserName())
						&& set.getString("Password").equals(
								detailsPojo.getPassword())) {
					System.out.println("Welcome to Home Page");
				}
			}
		} catch (SQLException e) {

		}
		return null;
	}
}
