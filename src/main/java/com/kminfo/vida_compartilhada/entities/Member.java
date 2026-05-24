package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "members")
public class Member extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

    @Column(nullable = false)
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "blood_type")
    private String bloodType;

    private String allergies;

    @Column(name = "chronic_conditions")
    private String chronicConditions;

    private String observations;

    @Column(name = "photo_url")
    private String photoUrl;

    @OneToMany(mappedBy = "member")
    private List<Medication> medications;

    @OneToMany(mappedBy = "member")
    private List<Record> records;
}
