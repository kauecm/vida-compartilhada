package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDateTime;

import com.kminfo.vida_compartilhada.entities.enuns.RecordSeverity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "symptoms")
public class Symptom extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;

    private String symptom;

    @Enumerated(EnumType.STRING)
    private RecordSeverity severity;

    private LocalDateTime observedAt;

    @Column(columnDefinition = "TEXT")
    private String observations;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public RecordSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(RecordSeverity severity) {
		this.severity = severity;
	}

	public LocalDateTime getObservedAt() {
		return observedAt;
	}

	public void setObservedAt(LocalDateTime observedAt) {
		this.observedAt = observedAt;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}
    
    
}
