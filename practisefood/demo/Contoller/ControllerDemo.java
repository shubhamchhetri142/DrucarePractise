package com.practisefood.demo.Contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practisefood.demo.Model.FoodDemo;
import com.practisefood.demo.Services.FoodService;


@RestController
public class ControllerDemo {
	@Autowired
	FoodService foodservice;
	@RequestMapping("/foods")
	public List<FoodDemo> getAllFoodDemo(){
		return foodservice.getAllFoodDemo();
	}
	@RequestMapping("/foods/{foodName}")
	public FoodDemo getFood(@PathVariable String foodName) {
		return foodservice.getFood(foodName);
	}
	@RequestMapping(method = RequestMethod.POST, value="/foods")
	public void addFoodDemo(@RequestBody FoodDemo fooddemo) {
		foodservice.addOneFood(fooddemo);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/foods/{id}")
	public void updateFood(@RequestBody FoodDemo fooddemo,@PathVariable String foodName) {
		foodservice.updateFood(fooddemo,foodName);
	}
	@RequestMapping(method =RequestMethod.DELETE, value="/foods/{id}")
	public void deleteFood(@PathVariable String fooddemo) {
		foodservice.deleteFood(fooddemo);
	}
}
