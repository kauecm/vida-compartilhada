package com.kminfo.vida_compartilhada.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "exams")
public class Exam extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;

    private String examType;

    private LocalDateTime examDate;

    private String resultStatus;

    @Column(columnDefinition = "TEXT")
    private String observations;
}