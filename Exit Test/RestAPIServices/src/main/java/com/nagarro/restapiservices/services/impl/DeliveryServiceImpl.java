/**
 * 
 */
package com.nagarro.restapiservices.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.restapiservices.entities.DeliveryEntity;
import com.nagarro.restapiservices.entities.DeliveryPKClass;
import com.nagarro.restapiservices.repositories.DeliveryRepository;
import com.nagarro.restapiservices.services.DeliveryServices;

/**
 * The Class DeliveryServiceImpl.
 *
 * @author heram
 */
@Service("DeliveryServices")
public class DeliveryServiceImpl implements DeliveryServices {

	/** The delivery repo. */
	@Autowired
	DeliveryRepository deliveryRepo;
	
	/**
	 * Checks if is deliverable.
	 *
	 * @param pinCode the pin code
	 * @param productCode the product code
	 * @return true, if is deliverable
	 */
	@Override
	public boolean isDeliverable(int pinCode, String productCode) {
		DeliveryPKClass primaryKey = new DeliveryPKClass();
		primaryKey.setPinCode(pinCode);
		primaryKey.setProductCode(productCode);
		Optional<DeliveryEntity> option = deliveryRepo.findById(primaryKey);
		return (option.isPresent());
	}

}
