/**
 * 
 */
package com.nagarro.restapiservices.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.restapiservices.entities.ProductEntity;
import com.nagarro.restapiservices.repositories.ProductRepositories;
import com.nagarro.restapiservices.services.ProductServices;

/**
 * The Class ProductServiceImpl.
 *
 * @author heram
 */
@Service("ProductServices")
public class ProductServiceImpl implements ProductServices {

	/** The product repo. */
	@Autowired
	ProductRepositories productRepo;
	
	/**
	 * Search product by.
	 *
	 * @param productName the product name
	 * @param productCode the product code
	 * @param productBrand the product brand
	 * @param productPricemaxRange the product pricemax range
	 * @param productPriceminRange the product pricemin range
	 * @return the list
	 */
	@Override
	public List<ProductEntity> searchProductBy(String productName, String productCode, String productBrand,double productPricemaxRange,double productPriceminRange) {
		return productRepo.getAllDetails(productName.trim(),productCode.trim(),productBrand.trim(),productPricemaxRange,productPriceminRange);
	}
	
	

	/**
	 * Gets the details.
	 *
	 * @param productCode the product code
	 * @return the details
	 */
	@Override
	public ProductEntity getDetails(String productCode) {
		Optional<ProductEntity> option = productRepo.findById(productCode.trim());
		if(option.isPresent())
			return option.get();
		else {
			return null;
		}
	}



	/**
	 * Gets the product brand.
	 *
	 * @return the product brand
	 */
	@Override
	public List<String> getProductBrand() {
		return productRepo.findAllByProductBrand();
	}
	
}
