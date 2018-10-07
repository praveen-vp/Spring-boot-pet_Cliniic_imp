package com.vp.springboot.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.vp.springboot.model.Speciality;
import com.vp.springboot.services.SpecialityService;

/**
 * 
 * @author praveen-vp
 * 07-Oct-2018
 *
 */
@Service
public class SpecialtyServiceMap extends AbstractService<Speciality, Long> implements SpecialityService {

	@Override
	public Speciality Save(Speciality object) {
		return super.save(object);
	}
	
	@Override
	public Set<Speciality> findAll() {
		return super.findAll();
	}

	@Override
	public Speciality findById(Long id) {
		return super.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		super.delete(object);
	}

}
