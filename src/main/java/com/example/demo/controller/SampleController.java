package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/student")
public class SampleController {
	
	
	@Autowired
	private UserService userService;
	
	
	List<User> userList = new ArrayList<>();
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public User getUser() {
		User u = new User();
		u.setId(2);
		u.setName("narasimah");
		
		return u;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void saveStudent(@RequestBody User user) {
		userService.saveUser(user);
	}

	@GetMapping("/get-all-users")
	@ResponseStatus(HttpStatus.OK)
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@GetMapping("/get-user-by-id/{id}")
	@ResponseStatus(HttpStatus.OK)
	public User getUserById(@PathVariable("id") Integer id) {
		return userList.stream().filter(s->s.getId()==id).findFirst().get();
	}
	
	@GetMapping("/get-user-by-name")
	@ResponseStatus(HttpStatus.OK)
	public User getUserBYName(@RequestParam("username") String username) {
		return userList.stream().filter(s->s.getName().equals(username)).findFirst().get();
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
		
		/*
		 * User user = userList.stream().filter(s -> s.getId() == id).findFirst().get();
		 * userList.remove(user);
		 */
	}
	
	@GetMapping("/get-user-by-range/{from}/{to}")
	@ResponseStatus(HttpStatus.OK)
	public List<User> getUserByRange(@PathVariable("from") Integer from,@PathVariable("to") Integer to) {
		List<User> result = new ArrayList<>();
		for(User u:userList) {
			if(u.getId()>=from && u.getId()<=to) {
				result.add(u);
			}
		}
		
		return result;
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}
	
	
}
