package com.kminfo.vida_compartilhada.entities;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "medication_logs")
public class MedicationLog extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "medication_id")
    private Medication medication;

    @ManyToOne
    @JoinColumn(name = "administered_by")
    private User administeredBy;

    @Column(name = "administered_at")
    private LocalDateTime administeredAt;

    @Column(name = "dosage_given")
    private String dosageGiven;

    private String notes;
}
