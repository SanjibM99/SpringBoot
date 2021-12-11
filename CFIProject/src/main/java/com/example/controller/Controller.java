package com.example.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.model.Model;
import com.example.service.SService;

@RestController
public class Controller {
	
	@Autowired
	private SService service;
	
	@PostMapping("/save")
	public String registerUser(@RequestBody Model model) {
		service.saveMyUser(model);
		return "Data has been saved";
	}
	
	@GetMapping("/show-all")
	@CrossOrigin
	public Iterable<Model> showAll(){
		return service.showAllUsers();
	}
	
	@GetMapping("/delete/{id}")
	@CrossOrigin
	public Iterable<Model> deleteUser(@PathVariable int id){
		return service.deleteUser(id);
	}
	
	@PutMapping("/update/{id}")
	@CrossOrigin
	public Model updateUser(@RequestBody  Model model ,@PathVariable int id) {
		return service.updateDetail(model);
	}

}
