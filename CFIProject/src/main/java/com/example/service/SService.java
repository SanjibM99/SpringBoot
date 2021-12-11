package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.model.Model;
import com.example.repository.Repo;

@Service
public class SService {

	@Autowired
	private Repo repo;
	
	public void saveMyUser(Model model) {
		repo.save(model);
		
	}
	public Iterable<Model> showAllUsers(){
		return repo.findAll();
	}

	public Iterable<Model> deleteUser(int id){
		repo.deleteById(id);
		return repo.findAll();
	}
	
	public Model updateDetail(Model model) {
		return repo.save(model);
	}	
}
