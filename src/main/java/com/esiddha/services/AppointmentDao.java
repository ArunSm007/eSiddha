package com.esiddha.services;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.esiddha.entities.AppointmentDetails;

public interface AppointmentDao extends CrudRepository<AppointmentDetails, Integer>{
	
//	public AppointmentDetails findAppointmentDetailsByDoctorIdAndAppointmentTime(String doctorId,Date appointmentTime);
}
