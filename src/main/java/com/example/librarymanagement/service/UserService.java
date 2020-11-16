package com.example.librarymanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarymanagement.model.User;
import com.example.librarymanagement.repository.UserRepository;

@Service
public class UserService {

	@Autowired  
	UserRepository userRepository;  
	
	public User getUserName(String name) {
		return userRepository.findByUserType(name);
	}

}
