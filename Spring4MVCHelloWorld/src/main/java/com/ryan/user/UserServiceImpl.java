package com.ryan.user;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.ryan.model.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Transactional
	public void addUser(User p) {
		userDao.create(p);
	}

	public void updateUser(User p) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public List<User> listUsers() {
		return userDao.retrieveUsers();
	}

	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeUser(int id) {
		// TODO Auto-generated method stub

	}

}
