package com.kminfo.vida_compartilhada.entities;


import java.time.LocalTime;

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
@Table(name = "medication_schedules")
public class MedicationSchedule extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "medication_id")
    private Medication medication;

    @Column(name = "scheduled_time")
    private LocalTime scheduledTime;

    @Column(name = "days_of_week")
    private String daysOfWeek;
}
