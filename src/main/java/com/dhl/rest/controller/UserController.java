package com.dhl.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhl.rest.config.interceptor.ResponseMessage;
import com.dhl.rest.domain.User;

import com.dhl.rest.services.UserServices;

@RestController
@RequestMapping("/rest/users")
public class UserController extends ServicesController<User> {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/all")
	public ResponseMessage<User> getAll(){
		return getResponse (this.userServices.getAll());		
	}

}
