package com.nagarro.restapiservices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class ProductEntity.
 */
@Entity
public class ProductEntity {
	
	/** The product code. */
	@Id
	private String productCode;
	
	/** The product name. */
	@Column
	private String productName;
	
	/** The product price. */
	@Column
	private double productPrice;
	
	/** The product details. */
	@Column
	private String productDetails;
	
	/** The product brand. */
	@Column
	private String productBrand;
	
	/** The product image URL. */
	@Column
	private String productImageURL;
	
	/**
	 * Gets the product image URL.
	 *
	 * @return the productImageURL
	 */
	public String getProductImageURL() {
		return productImageURL;
	}
	
	/**
	 * Sets the product image URL.
	 *
	 * @param productImageURL the productImageURL to set
	 */
	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}
	
	/**
	 * Gets the product brand.
	 *
	 * @return the productBrand
	 */
	public String getProductBrand() {
		return productBrand;
	}
	
	/**
	 * Sets the product brand.
	 *
	 * @param productBrand the productBrand to set
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	/**
	 * Gets the product details.
	 *
	 * @return the productDetails
	 */
	public String getProductDetails() {
		return productDetails;
	}
	
	/**
	 * Sets the product details.
	 *
	 * @param productDetails the productDetails to set
	 */
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ProductEntity [productCode=" + productCode + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productDetails=" + productDetails + "]";
	}
	
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
	 * Gets the product name.
	 *
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the product name.
	 *
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * Gets the product price.
	 *
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}
	
	/**
	 * Sets the product price.
	 *
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
}
