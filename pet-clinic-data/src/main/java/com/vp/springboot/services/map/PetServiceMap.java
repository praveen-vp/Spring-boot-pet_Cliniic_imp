/**
 * 16-Sep-2018
 * praveen-vp
 * PetServiceMap.java		
 */
package com.vp.springboot.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;
import com.vp.springboot.model.Pet;
import com.vp.springboot.services.PetService;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
@Service
public class PetServiceMap extends AbstractService<Pet, Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Pet Save(Pet object) {

		super.save(object);
		return object;
	}

}
