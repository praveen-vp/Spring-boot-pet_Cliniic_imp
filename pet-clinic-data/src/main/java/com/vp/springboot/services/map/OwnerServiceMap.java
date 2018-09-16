/**
 * 16-Sep-2018
 * praveen-vp
 * OwnerServiceMap.java		
 */
package com.vp.springboot.services.map;

import java.util.Set;

import com.vp.springboot.model.Owner;
import com.vp.springboot.services.CrudService;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
public class OwnerServiceMap extends AbstractService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Owner Save(Owner object) {

		super.save(object.getId(), object);
		return object;
	}

}
