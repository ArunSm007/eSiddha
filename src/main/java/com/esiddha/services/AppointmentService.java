package com.esiddha.services;

import java.util.Date;
import java.util.List;

import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.DoctorDetails;

public interface AppointmentService {
	public AppointmentDetails getAppointmentDetails(DoctorDetails doctorDetails,Date appointmentTime);
	public void saveAppointmentDetails(AppointmentDetails appointmentDetails);
	public AppointmentDetails getAppointmentDetails(int appointmentId);
}
