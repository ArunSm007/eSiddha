package com.esiddha.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="doctordetails")
@PrimaryKeyJoinColumn(name="userName")
public class DoctorDetails extends LoginDetails{
	
	private String doctorName;
	private PersonalDetails personalDetails;
	private List<AppointmentDetails> appointmentDetails = new ArrayList<AppointmentDetails>();
	private List<AvailabilityDetails> availabilityDetails = new ArrayList<AvailabilityDetails>();
	
	@Column(name="doctorName")
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="mobileNo")
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="doctorDetails")
	public List<AppointmentDetails> getAppointmentDetails() {
		return appointmentDetails;
	}

	public void setAppointmentDetails(List<AppointmentDetails> appointmentDetails) {
		this.appointmentDetails = appointmentDetails;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="doctorDetails")
	public List<AvailabilityDetails> getAvailabilityDetails() {
		return availabilityDetails;
	}

	public void setAvailabilityDetails(List<AvailabilityDetails> availabilityDetails) {
		this.availabilityDetails = availabilityDetails;
	}
	
}