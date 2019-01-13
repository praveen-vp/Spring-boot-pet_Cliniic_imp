package com.vp.springboot.services.springdatajpa;

import com.vp.springboot.model.Speciality;
import com.vp.springboot.repositories.SpecialityRepository;
import com.vp.springboot.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

public class SpecailitySDJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecailitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> findAll() {
        HashSet<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality Save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }
}
