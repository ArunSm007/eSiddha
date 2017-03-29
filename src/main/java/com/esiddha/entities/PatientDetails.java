package com.esiddha.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="patientdetails")
@PrimaryKeyJoinColumn(name="userName")
public class PatientDetails extends LoginDetails{
	
	private	String patientName;
	private PersonalDetails personalDetails;
	
	public PatientDetails() {
		
	}
	
	@Column(name="patientName")
	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="mobileNo")
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	
}
