package com.example.main.service;

import java.util.List;
import java.util.Optional;

import com.example.main.model.UserEntity;

public interface UserService {

	public List<UserEntity> showUsers();
	
	public UserEntity createUser(UserEntity userEntity);
	
	public Optional<UserEntity> editUser(UserEntity userEntity);
	
	public int deleteUser(long id);
	
}
