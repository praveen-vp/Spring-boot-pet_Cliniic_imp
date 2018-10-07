package com.vp.springboot.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {

	LocalDate date;
	String description;
	Pet pet;

	public Visit(LocalDate localDate, String description, Pet pet) {
		this.date = localDate;
		this.description = description;
		this.pet = pet;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}
