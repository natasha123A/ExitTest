/**
 * 
 */
package com.nagarro.restapiservices.services;

import com.nagarro.restapiservices.dto.UserDTO;
import com.nagarro.restapiservices.entities.UserEntity;

/**
 * The Interface UserServices.
 *
 * @author heram
 */
public interface UserServices {
	
	/**
	 * Creates the new user.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	boolean createNewUser(UserEntity user);
	
	/**
	 * Authenticate existing user.
	 *
	 * @param user the user
	 * @return the string
	 */
	String authenticateExistingUser(UserDTO user);
	
	/**
	 * Gets the firstname.
	 *
	 * @param uname the uname
	 * @return the firstname
	 */
	String getFirstname(String uname);
}
