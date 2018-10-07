/**
 * 16-Sep-2018
 * praveen-vp
 * OwnerServiceMap.java		
 */
package com.vp.springboot.services.map;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vp.springboot.model.Owner;
import com.vp.springboot.model.Pet;
import com.vp.springboot.services.OwnerServices;
import com.vp.springboot.services.PetService;
import com.vp.springboot.services.PetTypeService;

/**
 * @author praveen-vp 16-Sep-2018
 *
 */
@Service
public class OwnerServiceMap extends AbstractService<Owner, Long> implements OwnerServices {

	private final PetTypeService petTypeService;
	
	@Autowired
	private PetService petservice;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petservice) {
		this.petTypeService = petTypeService;
		this.petservice = petservice;
	}

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

		if (object != null) {
			if (object.getPets() != null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType() != null) {
						if (pet.getId() == null) {
							pet.setPetType(petTypeService.Save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet type cannot be null ");
					}

					if (pet.getId() == null) {
						Pet savedPet = petservice.Save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			
			return super.save(object);

		} else {
			return null;
		}
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
