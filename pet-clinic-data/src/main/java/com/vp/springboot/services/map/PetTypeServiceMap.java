package com.vp.springboot.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.vp.springboot.model.PetType;
import com.vp.springboot.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractService <PetType, Long> implements PetTypeService {

	@Override
	public PetType Save(PetType object) {
		return super.save(object);
	}

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		super.delete(object);
	}

}
