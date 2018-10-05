/**
 * 16-Sep-2018
 * praveen-vp
 * OwnerServices.java		
 */
package com.vp.springboot.services;

import org.springframework.stereotype.Service;

import com.vp.springboot.model.Owner;

/**
 * @author praveen-vp
 * 16-Sep-2018
 *
 */
public interface OwnerServices extends CrudService<Owner, Long>{
	
	Owner findByLastName(String lastName);

}
