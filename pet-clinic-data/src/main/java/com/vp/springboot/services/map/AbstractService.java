/**
 * 16-Sep-2018
 * praveen-vp
 * AbstractService.java		
 */
package com.vp.springboot.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author praveen-vp 16-Sep-2018
 * issue #7
 *
 */
public abstract class AbstractService<T, ID> {

	protected Map<ID, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(ID id, T object) {
		map.put(id, object);
		return object;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T object) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(object));
	}

}
