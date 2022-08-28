/**
 * 
 */
package com.nagarro.restapiservices.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.restapiservices.dto.UserDTO;
import com.nagarro.restapiservices.entities.UserEntity;
import com.nagarro.restapiservices.repositories.UserRepositories;
import com.nagarro.restapiservices.services.UserServices;
import com.nagarro.restapiservices.util.TokenGenerator;

/**
 * @author heram
 *
 */
@Service("UserServices")
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepositories userRepo;
	
	@Override
	public String authenticateExistingUser(UserDTO user) {
		Optional<UserEntity> option = userRepo.findById(user.getEmail());
		// if mailID is true -> password is checked and token is generated else false is returned 
		if(option.isPresent()){
			UserEntity usr = option.get();
			if(usr.getPassword().equals(user.getPassword())) {
				return TokenGenerator.tokenSupplier();
			}
			else {
				return "false";
			}
		}
		else {
			return "false";
		}
	}

	@Override
	public boolean createNewUser(UserEntity user) {
		// if mailID already exist user is not created.
		Optional<UserEntity> option = userRepo.findById(user.getEmail());
		if(option.isPresent()){
			return false;
		}
		else {
			userRepo.save(user);			
			return true;
		}
	}

	@Override
	public String getFirstname(String uname) {
		UserEntity usr=userRepo.getById(uname);
		return usr.getFirstName();
	}

}
