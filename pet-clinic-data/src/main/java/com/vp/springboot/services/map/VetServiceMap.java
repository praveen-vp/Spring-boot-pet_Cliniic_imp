/**
 * 16-Sep-2018
 * praveen-vp
 * VetServiceMap.java		
 */
package com.vp.springboot.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.vp.springboot.model.Vet;
import com.vp.springboot.services.CrudService;
import com.vp.springboot.services.VetService;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
@Service
public class VetServiceMap extends AbstractService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Vet Save(Vet object) {

		super.save(object.getId(), object);
		return object;
	}

}
