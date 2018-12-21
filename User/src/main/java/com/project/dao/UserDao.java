package com.project.dao;

import java.util.List;

import com.project.pojo.User;

public interface UserDao {
	
	public int add(User user);
	public int remove(int userId);
	public int update(User user) ;
	public List<User> getAll() ;
	

}
