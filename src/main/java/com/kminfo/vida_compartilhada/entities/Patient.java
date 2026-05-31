package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "patients")
public class Patient extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "care_group_id", nullable = false)
    private CareGroup careGroup;

    @Column(nullable = false, length = 150)
    private String name;

    private LocalDate birthDate;

    @Column(length = 5)
    private String bloodType;

    @Column(columnDefinition = "TEXT")
    private String allergies;

    @Column(columnDefinition = "TEXT")
    private String chronicConditions;

    @Column(columnDefinition = "TEXT")
    private String observations;
    
    @OneToMany(mappedBy = "patient")
    private List<PatientRecord> records;

    @OneToMany(mappedBy = "patient")
    private List<MedicationAdministration> medicationAdministrations;

    @OneToMany(mappedBy = "patient")
    private List<Attachment> attachments;

    @OneToMany(mappedBy = "patient")
    private List<MedicationAdministration> medications;

    @OneToMany(mappedBy = "patient")
    private List<Consultation> consultations;

    @OneToMany(mappedBy = "patient")
    private List<Exam> exams;

    @OneToMany(mappedBy = "patient")
    private List<Symptom> symptoms;

    @OneToMany(mappedBy = "patient")
    private List<Vaccine> vaccines;

    @OneToMany(mappedBy = "patient")
    private List<Measurement> measurements;
    
    
	public CareGroup getCareGroup() {
		return careGroup;
	}

	public void setCareGroup(CareGroup careGroup) {
		this.careGroup = careGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getAllergies() {
		return allergies;
	}

	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}

	public String getChronicConditions() {
		return chronicConditions;
	}

	public void setChronicConditions(String chronicConditions) {
		this.chronicConditions = chronicConditions;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public List<PatientRecord> getRecords() {
		return records;
	}

	public void setRecords(List<PatientRecord> records) {
		this.records = records;
	}

	public List<MedicationAdministration> getMedicationAdministrations() {
		return medicationAdministrations;
	}

	public void setMedicationAdministrations(List<MedicationAdministration> medicationAdministrations) {
		this.medicationAdministrations = medicationAdministrations;
	}

	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}

	public List<MedicationAdministration> getMedications() {
		return medications;
	}

	public void setMedications(List<MedicationAdministration> medications) {
		this.medications = medications;
	}

	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public List<Symptom> getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(List<Symptom> symptoms) {
		this.symptoms = symptoms;
	}

	public List<Vaccine> getVaccines() {
		return vaccines;
	}

	public void setVaccines(List<Vaccine> vaccines) {
		this.vaccines = vaccines;
	}

	public List<Measurement> getMeasurements() {
		return measurements;
	}

	public void setMeasurements(List<Measurement> measurements) {
		this.measurements = measurements;
	}

    
}
