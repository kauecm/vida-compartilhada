package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medication_administrations")
public class MedicationAdministration extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medication_id")
    private Medication medication;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "administered_by_user_id")
    private User administeredBy;

    private String dosage;

    private LocalDateTime administeredAt;

    @Column(columnDefinition = "TEXT")
    private String observations;

    public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}

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

		public String getDosage() {
			return dosage;
		}

		public void setDosage(String dosage) {
			this.dosage = dosage;
		}

		public String getObservations() {
			return observations;
		}

		public void setObservations(String observations) {
			this.observations = observations;
		}
	    
	    
}
