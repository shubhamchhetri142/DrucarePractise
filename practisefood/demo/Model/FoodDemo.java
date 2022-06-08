package com.practisefood.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodDemo {
	@Id
	private String foodName;
	private int foodId;
	private double foodPrice;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public double getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}
	public FoodDemo(String foodName, int foodId, double foodPrice) {
		super();
		this.foodName = foodName;
		this.foodId = foodId;
		this.foodPrice = foodPrice;
	}
	public FoodDemo() {
		
	}
	
	
}
