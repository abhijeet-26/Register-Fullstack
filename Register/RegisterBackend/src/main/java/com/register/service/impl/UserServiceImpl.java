package com.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.entity.User;
import com.register.repository.UserRepository;
import com.register.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

	
	private final UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		User savedUser = this.userRepository.save(user);
		return savedUser;
	}

	@Override
	public User getUserBy(int id) {
		User user = this.userRepository.findById(id).orElseThrow(null);
		return user;
	}

}
