/**
 * 
 */
package com.nagarro.restapiservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.restapiservices.entities.UserEntity;

/**
 * @author heram
 *
 */
@Repository
public interface UserRepositories extends JpaRepository<UserEntity, String> {

}
