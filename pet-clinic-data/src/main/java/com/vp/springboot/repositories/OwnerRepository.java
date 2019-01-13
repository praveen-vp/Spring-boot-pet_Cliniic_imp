package com.vp.springboot.repositories;

import com.vp.springboot.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
