package com.esiddha.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.esiddha.entities.LoginDetails;
@Service
public class LoginServiceImpl implements LoginService{
	
	LoginDao login;
	
	@Autowired
	public void setLogin(LoginDao login) {
		this.login = login;
	}

	@Override
	public void save(LoginDetails loginDetails) {
		// TODO Auto-generated method stub
		login.save(loginDetails);
	}
	
	@Override
	public void delete(LoginDetails loginDetails) {
		login.delete(loginDetails);
	}
	
	@Override
	public LoginDetails getLoginDetails(String userName) {
		// TODO Auto-generated method stub
		return login.findOne(userName);
	}
	
	@Override
	public LoginDetails validateUser(String userName, String password) {
		// TODO Auto-generated method stub
		LoginDetails loginDetails = getLoginDetails(userName);
		if(loginDetails != null){
			if(loginDetails.getPassWord().equals(password))
				return loginDetails;
		}
		return null;
	}
	
}
