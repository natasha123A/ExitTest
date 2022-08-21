/**
 * 
 */
package com.nagarro.restapiservices.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.restapiservices.dto.UserDTO;
import com.nagarro.restapiservices.entities.UserEntity;
import com.nagarro.restapiservices.services.UserServices;
/**
 * The Class LoginSignupController.
 *
 * @author heram
 */
@RestController
@RequestMapping("")
@CrossOrigin()
public class LoginSignupController {
	
	/** The user service. */
	@Autowired
	UserServices userService;
	
	/**
	 * Creates the user.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	//if user already exist then false is returned
	@PostMapping(value="/createuser")
	public ResponseEntity<String> createUser(@RequestBody UserDTO user) {
		UserEntity usr = new UserEntity();
		// using DTO for the layered structure
		usr.setEmail(user.getEmail());
		usr.setFirstName(user.getFirstName());
		usr.setLastName(user.getLastName());
		usr.setPassword(user.getPassword());
		if(userService.createNewUser(usr)) {
			return ResponseEntity.ok().body("200");
		}
		else {
			return ResponseEntity.badRequest().body("400");
		}
	}
	
	/**
	 * Authenticate user.
	 *
	 * @param user the user
	 * @return the string
	 */
	@PostMapping(value="/authenticate")
	public ResponseEntity<String> authenticateUser(@RequestBody UserDTO user) {
		String token = userService.authenticateExistingUser(user);
		if(token.equals("false")) {
			return ResponseEntity.badRequest().body("bad credentials");
		}
		else {
			user.setPassword(null);
			user.setFirstName(userService.getFirstname(user.getEmail()));
			return ResponseEntity.ok().body(user.getFirstName()+"|"+token);
		}
	}
}
