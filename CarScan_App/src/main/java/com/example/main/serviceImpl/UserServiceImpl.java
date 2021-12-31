package com.example.main.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.main.model.UserEntity;
import com.example.main.repo.UserRepo;
import com.example.main.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	public UserRepo userRepo;
		
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public UserEntity createUser(UserEntity userEntity) {
	 	return userRepo.save(userEntity);
	}

	@Override
	public Optional<UserEntity> editUser(UserEntity userEntity) {
		userRepo.save(userEntity);
		return userRepo.findById(userEntity.getId());
	}

	@Override
	public int deleteUser(long id) {
		userRepo.deleteById(id);
		return 0;
	}

	@Override
	public List<UserEntity> showUsers() {
		return userRepo.findAll();
	}	
	
}
