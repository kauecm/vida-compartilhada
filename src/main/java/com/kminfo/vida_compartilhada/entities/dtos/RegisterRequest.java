package com.kminfo.vida_compartilhada.entities.dtos;

import java.time.LocalDate;

public record RegisterRequest(String userName,

        String email,

        String password,

        String careGroupName,

        String patientName,

        LocalDate patientBirthDate) {

}
