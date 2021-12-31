package com.example.main.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.PostUpdate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.model.UserEntity;
import com.example.main.service.UserService;

@RestController()
@RequestMapping("/User")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/Create")
	public String create(@RequestBody UserEntity userEntity)
	{
		userService.createUser(userEntity);
		return "User Created...";
	}
	
	@PutMapping("/Edit")
	public String edit(@RequestBody UserEntity userEntity)
	{
		userService.editUser(userEntity);
		return "User Edited...";
	}
	
	@DeleteMapping(path="/Delete/{id}")
	public String delete(@PathVariable Long id)
	{
		if(userService.deleteUser(id)!=0)
		{
			return "Unable to delete User...";
		}
		return "User Deleted....";
	}
	
	@GetMapping("/Show")
	public List<UserEntity> show()
	{
		return userService.showUsers();
	}
	
}
