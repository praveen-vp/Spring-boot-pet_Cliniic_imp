package com.vp.springboot.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vp.springboot.model.Owner;
import com.vp.springboot.model.PetType;
import com.vp.springboot.model.Vet;
import com.vp.springboot.services.OwnerServices;
import com.vp.springboot.services.PetTypeService;
import com.vp.springboot.services.VetService;
import com.vp.springboot.services.map.OwnerServiceMap;
import com.vp.springboot.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerServices ownerServices;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	public DataLoader(OwnerServices ownerServices, VetService vetService, PetTypeService petTypeService) {
		this.ownerServices = ownerServices;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("dog");
		PetType savedPetDogType = petTypeService.Save(dog);

		PetType cat = new PetType();
		cat.setName("cat");
		PetType savedPetcatType = petTypeService.Save(cat);
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Mic");
		owner1.setLastName("Last");

		ownerServices.Save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Mic John");
		owner2.setLastName("Last Joe");
		
		ownerServices.Save(owner2);

		System.out.println("Loaded Owners ... ");
		
		Vet vets = new Vet();
		vets.setFirstName("Mic");
		vets.setLastName("Last");

		vetService.Save(vets);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Mic");
		vet1.setLastName("Last 2 ");

		vetService.Save(vet1);
		

		System.out.println("Loaded vets ... ");
		
	}

}