package com.stackroute.repository;

import java.util.ArrayList;
import java.util.List;

import com.stackroute.model.User;

public class UserRepositoryImpl implements UserRepository{

	private List<User> allUsers = null;
	
	public UserRepositoryImpl() {
		allUsers = new ArrayList<User>();
	}
	
	@Override
	public void addUser(User user) {
		allUsers.add(user);
	}

	@Override
	public boolean isExist(User user) {
		return allUsers.contains(user);
	}

	@Override
	public void removeUser(int code) {
		for(User usr : allUsers) {
			if(usr.getCode() == code) {
				allUsers.remove(usr);
			}
		}
	}

	@Override
	public boolean checkByCode(int code) {
		for(User usr : allUsers) {
			if(usr.getCode() == code) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		return allUsers;
	}
}
