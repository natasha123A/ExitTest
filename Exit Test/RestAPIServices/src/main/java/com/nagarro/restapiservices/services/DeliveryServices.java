/**
 * 
 */
package com.nagarro.restapiservices.services;

/**
 * @author heram
 *
 */
public interface DeliveryServices {
	/**
	 * Checks if is deliverable.
	 *
	 * @param pinCode the pin code
	 * @param productID the product Code
	 * @return the boolean
	 */
	boolean isDeliverable(int pinCode,String productCode);
}
