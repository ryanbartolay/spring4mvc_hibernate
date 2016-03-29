package com.ryan.user;

import java.util.List;

import com.ryan.model.User;

public interface UserService {
	public void addUser(User p);
	public void updateUser(User p);
	public List<User> listUsers();
	public User getUserById(int id);
	public void removeUser(int id);
}
