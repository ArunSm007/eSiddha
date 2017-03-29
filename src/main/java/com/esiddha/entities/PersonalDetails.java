package com.esiddha.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personaldetails")
public class PersonalDetails {
	
	private String mailId;
	private Date dob;
	private long mobileNo;
	private String address;
	private String bloodGroup;
	private String gender;
	
	public PersonalDetails() {
		
	}
	
	@Column(name="mailId",unique=true,nullable=false)
	public String getMailId() {
		return mailId;
	}
	
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	@Column(name="dob",nullable=false)
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Id
	@Column(name="mobileNo",unique=true,nullable=false)
	public long getMobileNo() {
		return mobileNo;
	}
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	@Column(name="address",nullable=false)
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name="bloodGroup",nullable=false)
	public String getBloodGroup() {
		return bloodGroup;
	}
	
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	@Column(name="gender",nullable=false)
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
