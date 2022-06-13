package com.practisefood.demo.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practisefood.demo.Model.FoodDemo;
import com.practisefood.demo.Repository.RepositoryDemo;
@Service
public class FoodService {
	
	@Autowired
	RepositoryDemo repositoryDemo;
		public List<FoodDemo> foodList=new ArrayList<FoodDemo>(Arrays.asList
				(new FoodDemo("Biryani",101,150),
				new FoodDemo("Noodles",102,130),
				new FoodDemo("Prawns",103,170)));
		public List<FoodDemo> getAllFoodDemo() {
			repositoryDemo.findAll().forEach(foodList::add);
			return foodList;
		}

		public FoodDemo getFood(String foodName) {
			return repositoryDemo.findById(foodName).get();
		}

		public void addOneFood(FoodDemo fooddemo) {
			repositoryDemo.save(fooddemo);
		}

		public void updateFood(FoodDemo fooddemo,String foodName) {
			repositoryDemo.save(fooddemo);
		}

		public void deleteFood(String fooddemo) {
			repositoryDemo.deleteById(fooddemo);
		}

}
