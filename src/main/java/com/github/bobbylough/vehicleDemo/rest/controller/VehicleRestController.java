package com.github.bobbylough.vehicleDemo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.bobbylough.vehicleDemo.model.Vehicle;
import com.github.bobbylough.vehicleDemo.service.VehicleService;

@RestController
@RequestMapping("/api/")
public class VehicleRestController {
	@Autowired
	private VehicleService vehicleService;
	@RequestMapping("/vehicles")
	public List<Vehicle> getVehicles() {
		Vehicle randomVehicle = new Vehicle();
		randomVehicle.setName("random" + (int)(Math.random() * 100));
		vehicleService.saveVehicle(randomVehicle);
		return vehicleService.getVehicle();
	}
}