/**
 * 
 */
package com.nagarro.restapiservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.restapiservices.entities.DeliveryEntity;
import com.nagarro.restapiservices.entities.DeliveryPKClass;

/**
 * @author heram
 *
 */
public interface DeliveryRepository extends JpaRepository<DeliveryEntity, DeliveryPKClass> {

}
