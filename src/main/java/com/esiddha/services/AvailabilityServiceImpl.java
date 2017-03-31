package com.esiddha.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;

@Service
public class AvailabilityServiceImpl implements AvailabilityService{
	
	AvailabilityDao availabilityDao;
	
	public AvailabilityDao getAvailabilityDao() {
		return availabilityDao;
	}
	
	@Autowired
	public void setAvailabilityDao(AvailabilityDao availabilityDao) {
		this.availabilityDao = availabilityDao;
	}
	
	@Override
	public List<AvailabilityDetails> findByAvailabilityDateAndDoctorDetails(Date availabilityDate,
			DoctorDetails doctorDetails) {
		// TODO Auto-generated method stub
		return availabilityDao.findByAvailabilityDateAndDoctorDetails(availabilityDate, doctorDetails);
	}
	
}
