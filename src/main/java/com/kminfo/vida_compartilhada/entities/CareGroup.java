package com.kminfo.vida_compartilhada.entities;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "care_groups")
public class CareGroup extends BaseEntity {

    @Column(nullable = false, length = 150)
    private String name;

    @OneToMany(mappedBy = "careGroup")
    private List<CareGroupUser> participants = new ArrayList<>();

    @OneToMany(mappedBy = "careGroup")
    private List<Patient> patients = new ArrayList<>();

    @OneToMany(mappedBy = "careGroup")
    private List<Invitation> invitations;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<CareGroupUser> getParticipants() {
		return participants;
	}

	public void setParticipants(List<CareGroupUser> participants) {
		this.participants = participants;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

    
}