package com.practisefood.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.practisefood.demo.Model.FoodDemo;

public interface RepositoryDemo extends CrudRepository<FoodDemo,String>{
	
}
