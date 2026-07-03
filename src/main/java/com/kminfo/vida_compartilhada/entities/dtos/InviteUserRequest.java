package com.kminfo.vida_compartilhada.entities.dtos;

import com.kminfo.vida_compartilhada.entities.enuns.CareGroupRole;

public record InviteUserRequest( String email,

        CareGroupRole role
) {

}
