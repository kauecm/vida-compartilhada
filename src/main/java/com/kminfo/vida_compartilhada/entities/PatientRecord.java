package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDateTime;

import com.kminfo.vida_compartilhada.entities.enuns.RecordCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "patient_records")
	public class PatientRecord extends BaseEntity {

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "patient_id", nullable = false)
		private Patient patient;

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "created_by_user_id", nullable = false)
		private User createdBy;

		@Enumerated(EnumType.STRING)
		private RecordCategory category;

		@Column(nullable = false)
		private String title;

		@Column(columnDefinition = "TEXT")
		private String summary;

		@Column(nullable = false)
		private LocalDateTime eventDate;


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

	public RecordCategory getCategory() {
		return category;
	}

	public void setCategory(RecordCategory category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}