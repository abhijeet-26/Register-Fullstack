package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.entity.User;
import com.register.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/user")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UserController {
	
	
	private final UserService userService;
	
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@Valid @RequestBody User user){
		User createUser = this.userService.createUser(user);
		User userByDB = this.userService.getUserBy(user.getUserId());
		return new ResponseEntity<User>(userByDB, HttpStatus.CREATED);
	}
	
}
