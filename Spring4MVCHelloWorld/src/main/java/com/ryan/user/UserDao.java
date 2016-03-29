package com.ryan.user;

import java.util.List;

import com.ryan.model.User;

public interface UserDao {
	public void create(User p);
	public void update(User p);
	public List<User> retrieveUsers();
	public User retrieveUserById(int id);
	public void deleteUser(int id);
}
