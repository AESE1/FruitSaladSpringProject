package com.natwest.fruitexercise.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.natwest.fruitexercise.persistence.domain.Fruit;
import com.natwest.fruitexercise.persistence.repo.FruitRepo;

public class FruitService {
	
	public FruitRepo repo;
	
	public FruitService (FruitRepo repo) {
		super();
		this.repo = repo;
		
	}

//	READ
	public List<Fruit> readAll (){
		return this.repo.findAll();
	}
	
//	FIND
	public Fruit findById(Long id) {
		return this.repo.findById(id).orElseThrow();
		
	}
	
//	CREATE
	public Fruit createFruit(Fruit fruit) {
		return this.repo.saveAndFlush(fruit);
	}
	
//	UPDATE
	public Fruit updateFruit(Long id, Fruit fruit) {
		Fruit exists = this.repo.getById(id);
		exists.setColour(fruit.getColour());
		exists.setName(fruit.getName());
		exists.setPrice(fruit.getPrice());
		Fruit updated = this.repo.save(exists);
		return updated;
	}
	
//	DELETE
	public Boolean deleteFruit(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);
		
	}
}
