package com.ms.User.Dao;

import java.util.List;

import com.ms.domain.User;

public interface UserDao {
	public void addUser(User user);
	public void deleteUser(Integer id);
	public void upDataUser(User user);
	public List<User> getUser(User user);
	
	public User loginUser(User user);
	public User checkUser(User user);
	public void registerUser(User user);
}
