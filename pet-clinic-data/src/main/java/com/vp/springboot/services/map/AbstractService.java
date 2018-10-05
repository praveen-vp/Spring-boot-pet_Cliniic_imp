/**
 * 16-Sep-2018
 * praveen-vp
 * AbstractService.java		
 */
package com.vp.springboot.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import com.vp.springboot.model.BaseEntity;

/**
 * @author praveen-vp 16-Sep-2018
 * issue #7
 *
 */
public abstract class AbstractService<T extends BaseEntity, ID extends Long > {

	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		System.out.println(map);
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(T object) {

		if(object != null) {
			if(object.getId() == null) {
				object.setId(getNextId());
			}

			map.put(object.getId(), object);
		} else {
			throw new RuntimeException("Object Cannot be null");
		}
		
		return object;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}
	
	private Long getNextId() {
		return Collections.max(map.keySet()) + 1 ;
	}

}
