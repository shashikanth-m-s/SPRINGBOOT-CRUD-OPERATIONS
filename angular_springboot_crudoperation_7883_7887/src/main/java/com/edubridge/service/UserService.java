package com.edubridge.service;

import java.util.List;

import com.edubridge.entity.User;

public interface UserService {

	public void register(User user);

	public List<User> findAllUsers();

	public User findUserById(Integer id);

	public List<User> findByEmail(String email);

	public List<User> cancelRegisteration(Integer id);

	public  User updateUserById(int id, User user); 
	}


