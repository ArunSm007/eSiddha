package com.esiddha.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;

public interface AvailabilityDao extends CrudRepository<AvailabilityDetails, Integer>{
	public List<AvailabilityDetails> findByAvailabilityDateAndDoctorDetails(Date availabilityDate,DoctorDetails doctorDetails);
}