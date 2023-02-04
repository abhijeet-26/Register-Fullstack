package com.register.service;

import com.register.entity.User;

public interface UserService {
	User createUser(User user);
	User getUserBy(int id);
	
}
