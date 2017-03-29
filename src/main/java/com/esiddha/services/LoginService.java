package com.esiddha.services;


import com.esiddha.entities.LoginDetails;

public interface LoginService {
	public void save(LoginDetails loginDetails);
	public void delete(LoginDetails loginDetails);
	public LoginDetails getLoginDetails(String userName);
	public LoginDetails validateUser(String userName,String password);
}
