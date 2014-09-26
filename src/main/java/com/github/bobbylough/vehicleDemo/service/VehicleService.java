package com.github.bobbylough.vehicleDemo.service;

import java.util.List;

import com.github.bobbylough.vehicleDemo.model.Vehicle;

public interface VehicleService {

	/**
	 *
	 * returns all vehicles in the database
	 *
	 * @return
	 */
	public List<Vehicle> getVehicles();


	/**
	 * save the file to the database
	 *
	 * @param vehicle
	 */
	public void saveVehicle(Vehicle vehicle);


	/**
	 * get the vehicle for the given id
	 *
	 * @param vehicle
	 */
	public Vehicle getVehicle(int id);
}
