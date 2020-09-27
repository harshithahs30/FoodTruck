package com.example.truck.foodTrucks.dao;

import java.util.List;

import com.example.truck.foodTrucks.entity.FoodTruck;

public interface FoodTruckDao {

	public List<FoodTruck> findAll();
	
	public FoodTruck findFoodTruck(int FoodTruckId);
	
	public void save(FoodTruck FoodTruck);
	
	public void deleteEmp(int FoodTruckId);
}
