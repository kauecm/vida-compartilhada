package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vaccines")
public class Vaccine extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    private String vaccineName;

    private String batchNumber;

    private LocalDate applicationDate;

    private String clinic;
}