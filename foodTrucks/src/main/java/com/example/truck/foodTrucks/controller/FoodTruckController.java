package com.example.truck.foodTrucks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.truck.foodTrucks.entity.FoodTruck;
import com.example.truck.foodTrucks.service.FoodTruckService;

@RestController
@RequestMapping("/api")
public class FoodTruckController {

	private FoodTruckService FoodTruckService;

	@Autowired
	public FoodTruckController(FoodTruckService FoodTruckService) {
		this.FoodTruckService = FoodTruckService;
	}

	@GetMapping("/FoodTrucks")
	public List<FoodTruck> findAll() {

		List<FoodTruck> FoodTrucks = FoodTruckService.findAll();
		return FoodTrucks;

	}

	@GetMapping("/FoodTrucks/{FoodTruckId}")
	public FoodTruck findFoodTruck(@PathVariable int FoodTruckId) {
		FoodTruck FoodTruck = FoodTruckService.findFoodTruck(FoodTruckId);
		if (FoodTruck == null) {
			throw new RuntimeException("FoodTruck Not found ");
		}
		return FoodTruck;

	}

	@PostMapping("/FoodTrucks")
	public FoodTruck save(@RequestBody FoodTruck FoodTruck) {
		FoodTruck.setLocationid(0);;
		FoodTruckService.save(FoodTruck);
		return FoodTruck;
	}

	@PutMapping("/FoodTrucks")
	public FoodTruck update(@RequestBody FoodTruck FoodTruck) {
		FoodTruckService.save(FoodTruck);
		return FoodTruck;
	}

	@DeleteMapping("/FoodTrucks/{FoodTruckid}")
	public void deleteEmp(@PathVariable int FoodTruckId) {
		FoodTruck FoodTruck = FoodTruckService.findFoodTruck(FoodTruckId);
		if (FoodTruck == null) {
			throw new RuntimeException("Cannot delete as the FoodTruck doesnt exist");
		}
		FoodTruckService.deleteEmp(FoodTruckId);
	}

}
