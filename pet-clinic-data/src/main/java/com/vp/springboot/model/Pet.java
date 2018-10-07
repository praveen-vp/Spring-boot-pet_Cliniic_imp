package com.vp.springboot.model;

import java.time.LocalDate;
import com.vp.springboot.model.Owner;
import com.vp.springboot.model.PetType;

public class Pet extends BaseEntity {

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
