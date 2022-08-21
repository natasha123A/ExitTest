/**
 * 
 */
package com.nagarro.restapiservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * The Class DeliveryEntity.
 *
 * @author heram
 */
@Entity
@IdClass(DeliveryPKClass.class)
public class DeliveryEntity {
	
	/** The product code. */
	@Id
	private String productCode;
	
	/** The state. */
	@Column
	private String state;
	
	/** The pin code. */
	@Id
	private int pinCode;
	
	/**
	 * Gets the product code.
	 *
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	
	/**
	 * Sets the product code.
	 *
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Gets the pin code.
	 *
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}
	
	/**
	 * Sets the pin code.
	 *
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "DeliveryEntity [productCode=" + productCode + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
}	
