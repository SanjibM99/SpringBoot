package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{

//	public Iterable<User> deleteByUsername(String username); 
	public Iterable<User> deleteById(int id);
	public User findByUsername(String username);
	
}
