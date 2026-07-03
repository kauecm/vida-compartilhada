package com.kminfo.vida_compartilhada.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.Consultation;

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

    List<Consultation>
    findByPatientId(Long patientId);
}

