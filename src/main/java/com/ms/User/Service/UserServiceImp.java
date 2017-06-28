package com.ms.User.Service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ms.User.Dao.UserDao;
import com.ms.domain.User;
@Service("userServiceImp")
@Transactional(rollbackFor = java.lang.Exception.class)
public class UserServiceImp implements UserService{
	
	@Resource(name="sqlSessionFactory")
	private SqlSessionFactory s;
	
	public void addUser(User user) {
		SqlSession openSession = s.openSession();
		UserDao ud = openSession.getMapper(UserDao.class);
		ud.addUser(user);
		System.out.println("ser");
		user.setUserAccount("aaa");
		
		System.out.println("?");
		user.setUserAccount("bbb");
	}

	@Override
	public void deleteUser(Integer userId) {
		//SqlSession openSession = s.openSession();
		//openSession.delete("", userId);
	}

	@Override
	public void upDataUser(User user) {
		//SqlSession openSession = s.openSession();
		//openSession.update("", user);
	}

	@Override
	public List<User> getUser(User user) {
		//SqlSession openSession = s.openSession();
		//List<Object> selectList = openSession.selectList("getUser", user);
		//System.out.println(selectList);
		return null;
	}

	@Override
	public User loginUser(User user) {
		//SqlSession openSession = s.openSession();
		//User loginUser = openSession.selectOne("login", user);
		//System.out.println(loginUser);
		return null;
	}

	@Override
	public User checkUser(User user) {
		//SqlSession openSession = s.openSession();
		//openSession.selectOne("", user);
		return null;
	}

	@Override
	public void registerUser(User user) {
		//SqlSession openSession = s.openSession();
		//openSession.insert("", user);
	}

}
