/**
 * 16-Sep-2018
 * praveen-vp
 * OwnerServiceMap.java		
 */
package com.vp.springboot.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import com.vp.springboot.model.Owner;
import com.vp.springboot.services.OwnerServices;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
@Service
public class OwnerServiceMap extends AbstractService<Owner, Long> implements OwnerServices {

	@Override
	public Set<Owner> findAll() {
		// TODO Auto-generated method stub
		System.out.println("Calling load all ---- ");
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
		
		System.out.println("save method called --");
		super.save(object);
		return object;
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
