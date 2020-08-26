package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	public void saveUser(User user);

	public void updateUser(User user);

	public void deleteUser(int id);

	public List<User> getAllUser();

	public User getUserById(int id);

	public List<User> getUsersByRange(int startId, int endId);
}
