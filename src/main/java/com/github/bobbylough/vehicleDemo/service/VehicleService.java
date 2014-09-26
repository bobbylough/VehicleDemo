package com.github.bobbylough.vehicleDemo.service;

import java.util.List;

import com.github.bobbylough.vehicleDemo.model.Vehicle;

public interface VehicleService {

	public List<Vehicle> getVehicle();

	public void saveVehicle(Vehicle vehicle);
}
