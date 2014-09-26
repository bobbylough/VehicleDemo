package com.github.bobbylough.vehicleDemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.bobbylough.vehicleDemo.service.VehicleService;

@Controller
public class VehicleHomeController {

	@Autowired
	private VehicleService vehicleService;

	@RequestMapping("/")
	public ModelAndView index(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("vehicleList", vehicleService.getVehicle());
		return mav;
	}

}
