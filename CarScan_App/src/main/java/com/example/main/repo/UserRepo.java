package com.example.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.model.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
