/**
 * 
 */
package com.nagarro.restapiservices.entities;

import java.io.Serializable;

import lombok.EqualsAndHashCode;

/**
 * @author heram
 *
 */
@EqualsAndHashCode
public class DeliveryPKClass implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productCode;
	private int pinCode;
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the pinCode
	 */
	public int getPinCode() {
		return pinCode;
	}
	/**
	 * @param pinCode the pinCode to set
	 */
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "DeliveryPKClass [productCode=" + productCode + ", pinCode=" + pinCode + "]";
	}
	
}
