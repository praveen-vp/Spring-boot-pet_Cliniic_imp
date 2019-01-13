package com.vp.springboot.repositories;

import com.vp.springboot.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
