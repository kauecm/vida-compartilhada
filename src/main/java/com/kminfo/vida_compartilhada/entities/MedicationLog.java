package com.kminfo.vida_compartilhada.entities;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

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

	public Medication getMedication() {
		return medication;
	}

	public void setMedication(Medication medication) {
		this.medication = medication;
	}

	public User getAdministeredBy() {
		return administeredBy;
	}

	public void setAdministeredBy(User administeredBy) {
		this.administeredBy = administeredBy;
	}

	public LocalDateTime getAdministeredAt() {
		return administeredAt;
	}

	public void setAdministeredAt(LocalDateTime administeredAt) {
		this.administeredAt = administeredAt;
	}

	public String getDosageGiven() {
		return dosageGiven;
	}

	public void setDosageGiven(String dosageGiven) {
		this.dosageGiven = dosageGiven;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
    
    
}
