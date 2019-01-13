package com.vp.springboot.repositories;

import com.vp.springboot.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRewpository extends CrudRepository<PetType, Long> {
}
