package com.kminfo.vida_compartilhada.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.Patient;

@Repository
public interface PatientRepository
        extends JpaRepository<Patient, Long> {

    List<Patient> findByCareGroupId(Long careGroupId);
}