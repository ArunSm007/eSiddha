package com.esiddha.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.DoctorDetails;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	private AppointmentDao appointmentDao;
	
	@Autowired
	public void setAppointmentDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}
	
	@Override
	public AppointmentDetails getAppointmentDetails(DoctorDetails doctorDetails,Date appointmentTime){
		return appointmentDao.findAppointmentDetailsByDoctorDetailsAndAppointmentTime(doctorDetails, appointmentTime);
	}

	@Override
	public void saveAppointmentDetails(AppointmentDetails appointmentDetails) {
		// TODO Auto-generated method stub
		appointmentDao.save(appointmentDetails);
	}

	@Override
	public AppointmentDetails getAppointmentDetails(int appointmentId) {
		// TODO Auto-generated method stub
		return appointmentDao.findOne(appointmentId);
	}
	
}
