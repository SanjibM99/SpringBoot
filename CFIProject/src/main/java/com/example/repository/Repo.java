package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Model;

public interface Repo extends CrudRepository<Model, Integer>{

}
