package com.pack.main.webcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.pack.main.domain.User;
import com.pack.main.domain.View;
import com.pack.main.repository.UserRepository;


@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository; 
	
	@GetMapping("/users")
	@JsonView(View.Summary.class)
	public Iterable <User> getUsers(){
	    return repository.findAll();
		  
	}
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user){
		System.out.print("HELOLEOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO"+user);
		  repository.save(user);
		return user;
		
	}
	
	
}