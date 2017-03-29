package com.esiddha.services;

import java.util.Date;
import java.util.List;

import com.esiddha.entities.AppointmentDetails;

public interface AppointmentService {
	public AppointmentDetails getAppointmentDetails(Date appointmentTime,String userName);
	public void saveAppointmentDetails(AppointmentDetails appointmentDetails);
}
