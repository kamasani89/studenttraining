package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServiceImple implements UserService {
	

	Map<Integer,User> userMap = new HashMap<>();
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);

	}

	@Override
	public void updateUser(User user) {
		User u = userMap.get(user.getId());
		u.setName(user.getName());
		u.setAge(u.getAge());
		userMap.put(user.getId(), u);

	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);

	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(int id) {
	
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getUsersByRange(int startId, int endId) {
		// TODO Auto-generated method stub
		return null;
	}

}
