package com.vp.springboot.repositories;

import com.vp.springboot.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
