/**
 * 
 */
package com.nagarro.restapiservices.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nagarro.restapiservices.entities.ProductEntity;

/**
 * The Interface ProductRepositories.
 *
 * @author heram
 */
public interface ProductRepositories extends JpaRepository<ProductEntity, String> {
	
	/**
	 * Gets the all details.
	 *
	 * @param productName the product name
	 * @param productCode the product code
	 * @param productBrand the product brand
	 * @param productPricemaxRange the product pricemax range
	 * @param productPriceminRange the product pricemin range
	 * @return the all details
	 */
	@Query("SELECT u FROM ProductEntity u WHERE u.productName LIKE lower(concat('%',:pname,'%')) AND u.productBrand Like lower(concat('%',:pbrand,'%')) AND u.productCode LIKE lower(concat('%',:pcode,'%')) AND u.productPrice <:maxRange AND u.productPrice >:minRange")
	public List<ProductEntity> getAllDetails(@Param("pname") String productName,@Param("pcode") String productCode,@Param("pbrand") String productBrand,@Param("maxRange") double productPricemaxRange,@Param("minRange") double productPriceminRange);
	
	
	/**
	 * Find all by product brand.
	 *
	 * @return the list
	 */
	@Query("select DISTINCT(t.productBrand) from ProductEntity t")
	public List<String> findAllByProductBrand();
}
