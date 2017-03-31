package com.esiddha.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;
import com.esiddha.services.AppointmentServiceImpl;
import com.esiddha.services.AvailabilityServiceImpl;
import com.esiddha.services.LoginService;

@Controller
@EnableAutoConfiguration
public class SiddhaController {
	
	LoginService impl;
	AppointmentServiceImpl impl1;
	AvailabilityServiceImpl impl2;
	
	public LoginService getImpl() {
		return impl;
	}
	
	@Autowired
	public void setImpl(LoginService impl) {
		this.impl = impl;
	}

	public AppointmentServiceImpl getImpl1() {
		return impl1;
	}
	
	@Autowired
	public void setImpl1(AppointmentServiceImpl impl1) {
		this.impl1 = impl1;
	}

	public AvailabilityServiceImpl getImpl2() {
		return impl2;
	}
	
	@Autowired
	public void setImpl2(AvailabilityServiceImpl impl2) {
		this.impl2 = impl2;
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", "hai");
		return "index";
	}
	
	@RequestMapping("/check")
	public String print(@RequestBody String t1) {
		System.out.println(t1+"content");
		return "index";
	}

}