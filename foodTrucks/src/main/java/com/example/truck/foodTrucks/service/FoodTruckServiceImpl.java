package com.example.truck.foodTrucks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.truck.foodTrucks.dao.FoodTruckDao;
import com.example.truck.foodTrucks.entity.FoodTruck;


@Service
public class FoodTruckServiceImpl implements FoodTruckService {

	private FoodTruckDao FoodTruckDao;
	
	@Autowired
	public FoodTruckServiceImpl(FoodTruckDao theFoodTruckDao) {
		this.FoodTruckDao = theFoodTruckDao;
	}
	
	@Override
	@Transactional
	public List<FoodTruck> findAll() {
		return FoodTruckDao.findAll();
	}

	@Override
	@Transactional
	public FoodTruck findFoodTruck(int FoodTruckId) {
		return FoodTruckDao.findFoodTruck(FoodTruckId);
	}

	@Override
	@Transactional
	public void save(FoodTruck FoodTruck) {
		FoodTruckDao.save(FoodTruck);
	}

	@Override
	@Transactional
	public void deleteEmp(int FoodTruckId) {
		FoodTruckDao.deleteEmp(FoodTruckId);
	}

}
