package com.esiddha.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esiddha.entities.DoctorDetails;
import com.esiddha.entities.LoginDetails;
import com.esiddha.services.AppointmentServiceImpl;
import com.esiddha.services.AvailabilityServiceImpl;
import com.esiddha.services.LoginService;

@Controller
@EnableAutoConfiguration
public class SiddhaController {
	
	LoginService loginService;
	AppointmentServiceImpl appointmentService;
	AvailabilityServiceImpl availabilityService;
	
	@Autowired
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@Autowired
	public void setAppointmentService(AppointmentServiceImpl appointmentService) {
		this.appointmentService = appointmentService;
	}

	@Autowired
	public void setAvailabilityService(AvailabilityServiceImpl availabilityService) {
		this.availabilityService = availabilityService;
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		LoginDetails loginDetails = new LoginDetails();
		model.put("loginDetails", loginDetails);
		return "index";
	}
	
	@PostMapping("/login")
	public String print(@ModelAttribute LoginDetails loginDetails,Map<String, Object> model) {
		LoginDetails details = loginService.validateUser(loginDetails.getUserName(), loginDetails.getPassWord());
		if(details == null){
			model.put("message", "Invalid Username / Password");
			return "index";
		}
		model.put("loginDetails", details);
		if(details instanceof DoctorDetails)
			return "doctorHome";
		return "patientHome";
	}

}