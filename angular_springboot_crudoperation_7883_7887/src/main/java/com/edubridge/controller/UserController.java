package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.edubridge.entity.User;
import com.edubridge.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		userService.register(user);
		return "Hi " +user.getName()+" registeration successfully completed";
	}
	
	@GetMapping("/getallusers")
	public List<User> findAllUsers(){
		return userService.findAllUsers();
	}
	@GetMapping("/findbyid/{uid}")
	public User findUserById(@PathVariable("uid") Integer id) {
		return userService.findUserById(id);
	}
	
	@GetMapping("/findbyemail/{email}")
	public List<User> findByEmail(@PathVariable String email) {
		return userService.findByEmail(email);
	}
	
	@DeleteMapping("/cancel/{id}")
	public List<User> cancelRegisteration(@PathVariable Integer id){
		return userService.cancelRegisteration(id);
	}
	@PutMapping("/update/{id}")
	public User updateUserById(@PathVariable int id,@RequestBody User user) { {
		
		return userService.updateUserById(id,user);
		
	}
}
}
