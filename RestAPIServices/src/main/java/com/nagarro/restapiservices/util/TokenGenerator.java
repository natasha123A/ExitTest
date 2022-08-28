/**
 * 
 */
package com.nagarro.restapiservices.util;

import java.time.Instant;
import java.util.UUID;


//This class generates a unique token for every successful authentication a user makes
/**
 * The Class TokenGenerator.
 */
// and sends it as header
public class TokenGenerator {
	
	/**
	 * Instantiates a new token generator.
	 */
	private TokenGenerator() {
		
	}
	
	 /**
 	 * Token supplier.
 	 *
 	 * @return the string
 	 */
 	public static final String tokenSupplier(){
		StringBuilder token = new StringBuilder();
		long currentTimeInMilisecond = Instant.now().toEpochMilli();
		return token.append(currentTimeInMilisecond).append("-")
				.append(UUID.randomUUID().toString()).toString();
	}
	
}
