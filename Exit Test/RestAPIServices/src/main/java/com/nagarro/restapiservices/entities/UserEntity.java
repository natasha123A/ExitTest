/**
 * 
 */
package com.nagarro.restapiservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * The Class UserEntity.
 *
 * @author heram
 */
@Entity
public class UserEntity {
	@Transient
	BasicTextEncryptor textEncryptor;
	
	@Id
	private String email;
	@Column
	private String password;
	@Column
	private String firstName;
	@Column
	private String lastName;
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		textEncryptor=new BasicTextEncryptor();
		textEncryptor.setPasswordCharArray("PASSWORD_TO_ENCRYPT".toCharArray());
		return textEncryptor.decrypt(password) ;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		textEncryptor=new BasicTextEncryptor();
		textEncryptor.setPasswordCharArray("PASSWORD_TO_ENCRYPT".toCharArray());
		this.password = textEncryptor.encrypt(password);
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "UserEntity [email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
	
}
