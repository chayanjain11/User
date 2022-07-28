package com.User.dao;

import org.springframework.data.repository.CrudRepository;

import com.User.entities.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	 public User findById(int id);   
	}
