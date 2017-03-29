package com.esiddha.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="availabilitydetails")
public class AvailabilityDetails {
	
	private int availabilityId;
	private Date fromTime;
	private Date toTime;
	
	@JsonIgnore
	private DoctorDetails doctorDetails;
	
	public AvailabilityDetails() {
	
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="availabilityId",nullable=false,unique=true)
	public int getAvailabilityId() {
		return availabilityId;
	}
	public void setAvailabilityId(int availabilityId) {
		this.availabilityId = availabilityId;
	}
	
	@Column(name="fromTime",nullable=false)
	public Date getFromTime() {
		return fromTime;
	}
	public void setFromTime(Date fromTime) {
		this.fromTime = fromTime;
	}
	
	@Column(name="toTime",nullable=false)
	public Date getToTime() {
		return toTime;
	}
	public void setToTime(Date toTime) {
		this.toTime = toTime;
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="doctorId")
	public DoctorDetails getDoctorDetails() {
		return doctorDetails;
	}

	public void setDoctorDetails(DoctorDetails doctorDetails) {
		this.doctorDetails = doctorDetails;
	}
	
}
