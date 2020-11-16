package com.example.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.model.User;
import com.example.librarymanagement.service.UserService;

@RestController
public class LoginController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
	public User getUserName(@RequestParam String name) {
		return userService.getUserName(name);
	}
}
