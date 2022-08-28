package com.nagarro.restapiservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.restapiservices.dto.ProductDTO;
import com.nagarro.restapiservices.entities.ProductEntity;
import com.nagarro.restapiservices.services.DeliveryServices;
import com.nagarro.restapiservices.services.ProductServices;

/**
 * The Class ProductSearchController.
 */
@RestController
@RequestMapping("/session")
@CrossOrigin()
public class ProductSearchController {
	
	/** The product service. */
	@Autowired
	ProductServices productServices;
	
	/** The delivery service. */
	@Autowired
	DeliveryServices deliveryServices;
	
	
	/**
	 * Search details.
	 *
	 * @param product the product
	 * @return the response entity
	 */
	@PostMapping(value="search")
	public ResponseEntity<List<ProductEntity>> searchDetails(@RequestBody ProductDTO product){
		return ResponseEntity.ok().body(productServices.searchProductBy(product.getProductName(), product.getProductCode(), product.getProductBrand(),product.getProductPricemaxRange(),product.getProductPriceminRange()));
	}
	
	
	/**
	 * Gets the details of product.
	 *
	 * @param productCode the product code
	 * @return the details of product
	 */
	@PostMapping(value="getDetails")
	public ProductEntity getDetailsOfProduct(@RequestBody String productCode){
		return (productServices.getDetails(productCode));
	}
	
	/**
	 * Checks if is deliverable.
	 *
	 * @param productCode the product code
	 * @param pinCode the pin code
	 * @return true, if is deliverable
	 */
	@PostMapping(value="isDeliverable")
	public boolean isDeliverable(@RequestParam(name="pid") String productCode, @RequestParam(name="pcode") int pinCode) {
		return deliveryServices.isDeliverable(pinCode, productCode);
	}
	
	@PostMapping()
	public List<String> getBrands(){
		return productServices.getProductBrand();
	}
	
}
