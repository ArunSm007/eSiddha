package com.esiddha.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;
import com.esiddha.services.LoginService;

@RestController
@EnableAutoConfiguration
public class SiddhaController {
	
	LoginService impl;
	
	public LoginService getImpl() {
		return impl;
	}
	
	@Autowired
	public void setImpl(LoginService impl) {
		this.impl = impl;
	}

	@RequestMapping("/")
	public DoctorDetails welcome(){
		DoctorDetails details = (DoctorDetails) impl.getLoginDetails("13CS005");
		return  details;
	}

}