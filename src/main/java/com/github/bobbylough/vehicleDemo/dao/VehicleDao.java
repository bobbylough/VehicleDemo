package com.github.bobbylough.vehicleDemo.dao;

import java.util.List;

import com.github.bobbylough.vehicleDemo.model.Vehicle;

public interface  VehicleDao {
	public List<Vehicle> getAllVehicles();
	public void saveVehicle(Vehicle vehicle);
	public Vehicle getVehicle(int id);
}
