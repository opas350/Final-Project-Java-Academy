package com.opas350.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opas350.Repository.UserRepository;
import com.opas350.model.User;
import com.opas350.model.UserStub;

@RestController
@RequestMapping("api/v1/")
public class UserController {
	
	@Autowired
	private	UserRepository userRepo;
	
	@RequestMapping(value = "users", method = RequestMethod.GET)
	public List<User> list() {
		return userRepo.findAll();
	}
	
	@RequestMapping(value = "users", method = RequestMethod.POST)
	public User create(@RequestBody User user) {
		return userRepo.saveAndFlush(user);
	}
	
	@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
	public User get(@PathVariable Long id) {
		return userRepo.findOne(id);
	}
	
	@RequestMapping(value = "users/{id}", method = RequestMethod.PUT )
	public User update(@PathVariable Long id, @RequestBody User user) {
		User userFromDB = userRepo.findOne(id);
		BeanUtils.copyProperties(user, userFromDB);
		return userRepo.saveAndFlush(userFromDB);
	}
	
	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
	public User delete(@PathVariable Long id) {
		User userFromDB = userRepo.findOne(id);
		userRepo.delete(userFromDB);
		return userFromDB;
	}

	
	
	
//	This code can be used for debug, it uses the UserStub.list to test the UI
//	
//	@RequestMapping(value = "users", method = RequestMethod.GET)
//	public List<User> list() {
//		return UserStub.list();
//	}
//	
//	@RequestMapping(value = "users", method = RequestMethod.POST)
//	public User create(@RequestBody User user) {
//		return UserStub.create(user);
//	}
//	
//	@RequestMapping(value = "users/{id}", method = RequestMethod.GET)
//	public User get(@PathVariable Long id) {
//		return UserStub.get(id);
//	}
//	
//	@RequestMapping(value = "users/{id}", method = RequestMethod.PUT )
//	public User update(@PathVariable Long id, @RequestBody User user) {
//		return UserStub.update(id, user);
//	}
//	
//	@RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
//	public User delete(@PathVariable Long id) {
//		return UserStub.delete(id);
//	}
	

}
