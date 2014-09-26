package com.github.bobbylough.vehicleDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.bobbylough.vehicleDemo.dao.VehicleDao;
import com.github.bobbylough.vehicleDemo.model.Vehicle;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleDao vehicleDao;


	@Override
	public List<Vehicle> getVehicles() {
		return vehicleDao.getAllVehicles();
	}

	@Override
	public void saveVehicle(Vehicle vehicle) {
		vehicleDao.saveVehicle(vehicle);
	}

	@Override
	public Vehicle getVehicle(int id) {
		return vehicleDao.getVehicle(id);
	}

}
