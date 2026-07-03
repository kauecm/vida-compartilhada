package com.kminfo.vida_compartilhada.entities.dtos;

import java.time.LocalDate;

public record CreatePatientRequest( String name,

        LocalDate birthDate,

        String bloodType,

        String allergies,

        String chronicConditions,

        String observations) {

}
