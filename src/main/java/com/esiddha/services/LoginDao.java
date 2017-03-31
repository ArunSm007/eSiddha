package com.esiddha.services;

import org.springframework.data.repository.CrudRepository;

import com.esiddha.entities.LoginDetails;

public interface LoginDao extends CrudRepository<LoginDetails, String>{

}
