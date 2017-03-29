package com.esiddha.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esiddha.entities.AppointmentDetails;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	private AppointmentDao appointmentDao;
	
	@Autowired
	public void setAppointmentDao(AppointmentDao appointmentDao) {
		this.appointmentDao = appointmentDao;
	}
	
	@Override
	public AppointmentDetails getAppointmentDetails(Date appointmentTime, String doctorId){
		return null;
//		return appointmentDao.findAppointmentDetailsByDoctorIdAndAppointmentTime(doctorId, appointmentTime);
	}

	@Override
	public void saveAppointmentDetails(AppointmentDetails appointmentDetails) {
		// TODO Auto-generated method stub
		appointmentDao.save(appointmentDetails);
	}
	
}
