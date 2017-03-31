package com.esiddha.services;

import java.util.Date;
import java.util.List;

import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;

public interface AvailabilityService {
	public List<AvailabilityDetails> findByAvailabilityDateAndDoctorDetails(Date availabilityDate,DoctorDetails doctorDetails);
}
