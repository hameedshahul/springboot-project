package com.example.demo.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userControlls {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(method = RequestMethod.GET, value ="/registeredUser")
	public List<Users> allREgisterUser(){
		return userservice.getAllUserlist();
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/register")
	public void allREgisterUser(@RequestBody Users users){
		userservice.newuser(users);
	}

}
