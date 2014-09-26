package com.github.bobbylough.vehicleDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.github.bobbylough.vehicleDemo.model.Vehicle;

@Transactional
@Repository
public class VehicleDaoImpl implements VehicleDao {

	@Autowired
	private SessionFactory sessionFactory;


	@Override
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
	public List<Vehicle> getAllVehicles() {
		try {
			return sessionFactory.getCurrentSession().createCriteria(Vehicle.class).list();
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void saveVehicle(Vehicle vehicle) {
		try {
			Session mySession = sessionFactory.getCurrentSession();
			mySession.save(vehicle);
			mySession.flush();
		} catch (Exception e) {
			System.out.println(e);
		}
	}




}
