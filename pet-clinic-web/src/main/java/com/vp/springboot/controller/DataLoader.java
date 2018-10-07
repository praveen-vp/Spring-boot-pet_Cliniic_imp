package com.vp.springboot.controller;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vp.springboot.model.Owner;
import com.vp.springboot.model.Pet;
import com.vp.springboot.model.PetType;
import com.vp.springboot.model.Speciality;
import com.vp.springboot.model.Vet;
import com.vp.springboot.services.OwnerServices;
import com.vp.springboot.services.PetTypeService;
import com.vp.springboot.services.SpecialityService;
import com.vp.springboot.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerServices ownerServices;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;

	public DataLoader(OwnerServices ownerServices, VetService vetService, PetTypeService petTypeService,
			SpecialityService specialityService) {

		this.ownerServices = ownerServices;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
	}

	@Override
	public void run(String... args) throws Exception {

		int count = petTypeService.findAll().size();

		if (count == 0) {
			loadData();
		}
	}

	private void loadData() {

		PetType dog = new PetType();
		dog.setName("dog");
		PetType savedPetDogType = petTypeService.Save(dog);

		PetType cat = new PetType();
		cat.setName("cat");
		PetType savedPetcatType = petTypeService.Save(cat);

		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialityService.Save(radiology);

		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialityService.Save(surgery);

		Speciality dentinstry = new Speciality();
		dentinstry.setDescription("Dentinstry");
		Speciality savedDentintry = specialityService.Save(dentinstry);

		Owner owner1 = new Owner();
		owner1.setFirstName("Mic");
		owner1.setLastName("Last");
		owner1.setAddress("owner 1 Address is empty");
		owner1.setCity("No Way");
		owner1.setTelephone("is it necossory");

		Pet micPet = new Pet();
		micPet.setBirthDate(LocalDate.now());
		micPet.setPetType(savedPetDogType);
		micPet.setOwner(owner1);
		owner1.getPets().add(micPet);

		ownerServices.Save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Mic John");
		owner2.setLastName("Last Joe");
		owner2.setAddress("owner 2 come from nowhere");
		owner2.setCity("No Idea Man");
		owner2.setTelephone("!@#$$%%^&%*^*");

		Pet johnPet = new Pet();
		johnPet.setBirthDate(LocalDate.now());
		johnPet.setPetType(savedPetcatType);
		johnPet.setOwner(owner2);
		owner2.getPets().add(johnPet);

		ownerServices.Save(owner2);

		System.out.println("Loaded Owners ... ");

		Vet vets = new Vet();
		vets.setFirstName("Mic");
		vets.setLastName("Last");
		vets.getSpecialities().add(savedRadiology);
		vetService.Save(vets);

		Vet vet1 = new Vet();
		vet1.setFirstName("Mic");
		vet1.setLastName("Last 2 ");
		vet1.getSpecialities().add(savedSurgery);
		vetService.Save(vet1);

		System.out.println("Loaded vets ... ");

	}

}