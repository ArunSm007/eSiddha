package com.esiddha.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="logindetails")
@Inheritance(strategy=InheritanceType.JOINED)
public class LoginDetails {
	
	private String userName;
	private String passWord;
	private String userType;
	private boolean activeStatus;
	
	public LoginDetails() {
		
	}
	
	@Id
	@Column(unique=true,nullable=false,name="userName")
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name="passWord")
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	@Column(name="userType")
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Column(name="activeStatus")
	public boolean isActiveStatus() {
		return activeStatus;
	}
	
	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}
	
}
