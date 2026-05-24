package com.kminfo.vida_compartilhada.entities;


import java.time.LocalDateTime;

import com.kminfo.vida_compartilhada.entities.enuns.FamilyRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "invites")
public class Invite extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "family_id")
    private Family family;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private FamilyRole role;

    @Column(nullable = false, unique = true)
    private String token;

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    private Boolean accepted = false;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}
