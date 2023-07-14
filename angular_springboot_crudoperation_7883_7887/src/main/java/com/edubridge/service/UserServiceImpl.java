package com.edubridge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.edubridge.entity.User;
import com.edubridge.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepository;
	@Override
	public void register(User user) {
		userRepository.save(user);
		
	}
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
	@Override
	public List<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}
	@Override
	public List<User> cancelRegisteration(Integer id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);;
		return userRepository.findAll();
	}
	@Override
	public User updateUserById(int id, User user) {
		User dbUser=userRepository.findById(id).get();
		dbUser.setDomain(user.getDomain());
		dbUser.setEmail(user.getEmail());
		dbUser.setExperience(user.getExperience());
		dbUser.setName(user.getName());
		
		return userRepository.save(dbUser);
	}
	

}
