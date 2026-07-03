package com.kminfo.vida_compartilhada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}