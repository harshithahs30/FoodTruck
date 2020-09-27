package com.example.truck.foodTrucks.service;

import java.util.List;

import com.example.truck.foodTrucks.entity.FoodTruck;

public interface FoodTruckService {

	public List<FoodTruck> findAll();
	
	public FoodTruck findFoodTruck(int FoodTruckId);
	
	public void save(FoodTruck FoodTruck);
	
	public void deleteEmp(int FoodTruckId);	
}
