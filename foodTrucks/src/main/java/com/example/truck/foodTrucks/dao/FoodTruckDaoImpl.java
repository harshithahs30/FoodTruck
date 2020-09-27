package com.example.truck.foodTrucks.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.truck.foodTrucks.entity.FoodTruck;

@Repository
public class FoodTruckDaoImpl implements FoodTruckDao {

	private EntityManager entityManager;
	
	@Autowired
	public FoodTruckDaoImpl(EntityManager theEntityManager) {
		this.entityManager = theEntityManager;
	}
	
	@Override
	public List<FoodTruck> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<FoodTruck> theQuery = currentSession.createQuery("from FoodTruck",FoodTruck.class);
		
		List<FoodTruck> FoodTrucks = theQuery.getResultList();
		
		return FoodTrucks;
	}

	@Override
	public FoodTruck findFoodTruck(int FoodTruckId) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		FoodTruck FoodTruck = currentSession.get(FoodTruck.class, FoodTruckId);
		return FoodTruck;
	}

	@Override
	public void save(FoodTruck FoodTruck) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(FoodTruck);
	}

	@Override
	public void deleteEmp(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query theQuery = currentSession.createQuery("delete from FoodTruck where id=:FoodTruckId");
		theQuery.setParameter("FoodTruckId", id);
		theQuery.executeUpdate();
		
	}

}
