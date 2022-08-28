package com.nagarro.restapiservices.dto;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * The Class UserDTO.
 */
public class UserDTO {
		
		/** The text encryptor. */
		private BasicTextEncryptor textEncryptor;
		
		/** The email. */
		private String email;
		
		/** The password. */
		private String password;
		
		/** The first name. */
		private String firstName;
		
		/** The last name. */
		private String lastName;
		
		/**
		 * Gets the email.
		 *
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		
		/**
		 * Sets the email.
		 *
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		
		/**
		 * Gets the password.
		 *
		 * @return the password
		 */
		public String getPassword() {
			textEncryptor=new BasicTextEncryptor();
			textEncryptor.setPasswordCharArray("PASSWORD_TO_ENCRYPT".toCharArray());
			return textEncryptor.decrypt(password) ;
		}
		
		/**
		 * Sets the password.
		 *
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			textEncryptor=new BasicTextEncryptor();
			textEncryptor.setPasswordCharArray("PASSWORD_TO_ENCRYPT".toCharArray());
			this.password = textEncryptor.encrypt(password);
		}
		
		/**
		 * Gets the first name.
		 *
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		
		/**
		 * Sets the first name.
		 *
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		/**
		 * Gets the last name.
		 *
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		
		/**
		 * Sets the last name.
		 *
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		/**
		 * To string.
		 *
		 * @return the string
		 */
		@Override
		public String toString() {
			return "UserEntity [email=" + email + ", password=" + password + ", firstName=" + firstName + ", lastName="
					+ lastName + "]";
		}
		
}
