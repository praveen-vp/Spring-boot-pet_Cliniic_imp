package com.vp.springboot.model;

import java.util.Set;

import com.vp.springboot.model.Person;

public class Owner extends Person {

	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
