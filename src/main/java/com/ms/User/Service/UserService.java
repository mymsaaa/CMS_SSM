package com.ms.User.Service;

import java.util.List;

import com.ms.domain.User;

public interface UserService {
	//用户删除
	public void deleteUser(Integer userId);
	//用户更新资料
	public void upDataUser(User user);
	//搜索用户、userName模糊+ID
	public List<User> getUser(User user);
	//用户登陆
	public User loginUser(User user);
	//用户名检查，注册之前需要调用，如果该用户名和帐号存在，则不能注册
	public User checkUser(User user);
	//用户注册
	public void registerUser(User user);
}
