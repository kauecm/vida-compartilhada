package com.kminfo.vida_compartilhada.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.MedicationAdministration;

@Repository
public interface MedicationAdministrationRepository extends JpaRepository<MedicationAdministration, Long> {

    List<MedicationAdministration>
    findByPatientIdOrderByAdministeredAtDesc(
            Long patientId
    );
}