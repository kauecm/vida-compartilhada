package com.kminfo.vida_compartilhada.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.PatientRecord;

@Repository
public interface PatientRecordRepository
        extends JpaRepository<PatientRecord, Long> {

    List<PatientRecord>
    findByPatientIdOrderByEventDateDesc(
            Long patientId
    );
}