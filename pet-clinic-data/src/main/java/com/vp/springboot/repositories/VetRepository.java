package com.vp.springboot.repositories;

import com.vp.springboot.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
