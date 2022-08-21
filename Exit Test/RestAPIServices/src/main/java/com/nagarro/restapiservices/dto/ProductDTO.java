package com.nagarro.restapiservices.dto;

/**
 * The Class ProductDTO.
 */
public class ProductDTO {
	
	/** The product code. */
	private String productCode;
	
	/** The product name. */
	private String productName;
	
	/** The product details. */
	private String productDetails;
	
	/** The product brand. */
	private String productBrand;
	
	/** The product pricemax range. */
	private double productPricemaxRange;
	
	/** The product pricemin range. */
	private double productPriceminRange;
	
	private String productImageURL;

	/**
	 * @return the productImageURL
	 */
	public String getProductImageURL() {
		return productImageURL;
	}

	/**
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
	 * @param brand the new product brand
	 */
	public void setProductBrand(String brand) {
		this.productBrand = brand;
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
	 * Gets the product pricemax range.
	 *
	 * @return the productPricemaxRange
	 */
	public double getProductPricemaxRange() {
		return productPricemaxRange;
	}

	/**
	 * Sets the product pricemax range.
	 *
	 * @param productPricemaxRange the productPricemaxRange to set
	 */
	public void setProductPricemaxRange(double productPricemaxRange) {
		this.productPricemaxRange = productPricemaxRange;
	}

	/**
	 * Gets the product pricemin range.
	 *
	 * @return the productPriceminRange
	 */
	public double getProductPriceminRange() {
		return productPriceminRange;
	}

	/**
	 * Sets the product pricemin range.
	 *
	 * @param productPriceminRange the productPriceminRange to set
	 */
	public void setProductPriceminRange(double productPriceminRange) {
		this.productPriceminRange = productPriceminRange;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ProductDTO [productCode=" + productCode + ", productName=" + productName + ", productDetails="
				+ productDetails + ", productBrand=" + productBrand + ", productPricemaxRange=" + productPricemaxRange
				+ ", productPriceminRange=" + productPriceminRange + "]";
	}


	
}
