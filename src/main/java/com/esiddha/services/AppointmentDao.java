package com.esiddha.services;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.DoctorDetails;

public interface AppointmentDao extends CrudRepository<AppointmentDetails, Integer>{
	
	public AppointmentDetails findAppointmentDetailsByDoctorDetailsAndAppointmentTime(DoctorDetails doctorDetails,Date appointmentTime);
	
}
