package com.github.bobbylough.vehicleDemo.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.github.bobbylough.vehicleDemo.model.Vehicle;
import com.github.bobbylough.vehicleDemo.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleRestController {
	@Autowired
	private VehicleService vehicleService;


	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Vehicle> getAllVehicles() {
		Vehicle randomVehicle = new Vehicle();
		randomVehicle.setName("random" + (int)(Math.random() * 100));
		vehicleService.saveVehicle(randomVehicle);
		return vehicleService.getVehicles();
	}


	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public Vehicle getVehicle(@PathVariable int id) {
		return vehicleService.getVehicle(id);

	}

}