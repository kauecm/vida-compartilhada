package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDateTime;

import com.kminfo.vida_compartilhada.entities.enuns.MeasurementType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "measurements")
public class Measurement extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @Enumerated(EnumType.STRING)
    private MeasurementType type;

    private Double value;

    private String unit;

    private LocalDateTime measuredAt;
}