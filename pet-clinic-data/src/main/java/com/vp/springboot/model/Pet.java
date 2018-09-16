package com.vp.springboot.model;

import java.time.LocalDate;
import com.vp.springboot.model.Owner;
import com.vp.springboot.model.PetType;

public class Pet {

	private Long id;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the petType
	 */
	public PetType getPetType() {
		return petType;
	}

	/**
	 * @param petType
	 *            the petType to set
	 */
	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	/**
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * @param owner
	 *            the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
