package com.stackroute.repository;

import java.util.List;

import com.stackroute.model.User;

public interface UserRepository {
	public void addUser(User user);
	public boolean isExist(User user);
	public void removeUser(int code);
	public boolean checkByCode(int code);
	public List<User> getAllUsers();
}
