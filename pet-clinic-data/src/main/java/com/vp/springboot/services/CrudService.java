package com.vp.springboot.services;

import java.util.Set;

/**
 * 
 * @author praveen-vp
 * 16-Sep-2018
 *
 * @param <T>
 * @param <ID>
 */
public interface CrudService <T, ID>{

		Set<T> findAll();
		
		T findById(ID id);
		
		T Save(T object);
		
		void delete(T object);
		
		void deleteById(ID id);
}
