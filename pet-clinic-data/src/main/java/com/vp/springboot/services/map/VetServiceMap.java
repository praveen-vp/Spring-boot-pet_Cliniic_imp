/**
 * 16-Sep-2018
 * praveen-vp
 * VetServiceMap.java		
 */
package com.vp.springboot.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;

import com.vp.springboot.model.Speciality;
import com.vp.springboot.model.Vet;
import com.vp.springboot.services.SpecialityService;
import com.vp.springboot.services.VetService;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
@Service
public class VetServiceMap extends AbstractService<Vet, Long> implements VetService {

	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService) {
		this.specialityService = specialityService;
	}
	
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

		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if(speciality.getId() == null) {					
					Speciality savedSpeciality = specialityService.Save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		
		super.save(object);
		return object;
	}

}
