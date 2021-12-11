package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;

	public UserService() {}
	
	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}

	public void saveMyUser(User user) {
		repo.save(user);
	}
	public Iterable<User> showAllUsers(){
		return repo.findAll();
	}
	public Iterable<User> deleteUserByUsername(int id){
		repo.deleteById(id);
		return repo.findAll();
	}
	

	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

	public User updateDetail(User user) {
//		Integer existing = user.getId();
//		User std=repo.findById(existing).get();
//		std.setFirstname(user.getFirstname());
//		std.setLastname(user.getLastname());
//		std.setAge(user.getAge());
//		std.setUsername(user.getFirstname());
//		std.setPassword(user.getPassword());
		
		return repo.save(user);
		
		
	
	}
	
}
