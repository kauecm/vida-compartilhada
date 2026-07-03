package com.kminfo.vida_compartilhada.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.Invitation;
import com.kminfo.vida_compartilhada.entities.enuns.InvitationStatus;

@Repository
public interface InvitationRepository
        extends JpaRepository<Invitation, Long> {

    Optional<Invitation>
    findByToken(String token);

    List<Invitation>
    findByEmailAndStatus(
            String email,
            InvitationStatus status
    );
}