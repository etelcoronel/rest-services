package com.dhl.rest.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dhl.rest.domain.User;
import com.dhl.rest.mapper.UserMapper;

@Component("UserServices")
public class UserServices {
	private UserMapper userMapper;
	
	public UserServices(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public List<User> getAll(){
		return this.userMapper.getAll();
	}

}
