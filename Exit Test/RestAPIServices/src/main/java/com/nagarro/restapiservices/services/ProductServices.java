package com.nagarro.restapiservices.services;

import java.util.List;

import com.nagarro.restapiservices.entities.ProductEntity;

/**
 * The Interface ProductServices.
 */
public interface ProductServices {
	
	/**
	 * Search product by.
	 *
	 * @param productName the product name
	 * @param productCode the product code
	 * @param brand the brand
	 * @param productPricemaxRange the product pricemax range
	 * @param productPriceminRange the product pricemin range
	 * @return the list
	 */
	List<ProductEntity> searchProductBy(String productName,String productCode,String brand,double productPricemaxRange,double productPriceminRange);
	
	/**
	 * Gets the details.
	 *
	 * @param productCode the product code
	 * @return the details
	 */
	ProductEntity getDetails(String productCode);
	
	/**
	 * Gets the product brand.
	 *
	 * @return the product brand
	 */
	List<String> getProductBrand();
}
