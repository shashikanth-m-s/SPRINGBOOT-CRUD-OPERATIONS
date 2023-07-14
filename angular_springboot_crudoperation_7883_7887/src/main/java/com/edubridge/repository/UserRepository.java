package com.edubridge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.edubridge.entity.User;
import com.edubridge.service.UserService;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User> findByEmail(String email);

}
