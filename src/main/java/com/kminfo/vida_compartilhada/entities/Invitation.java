package com.kminfo.vida_compartilhada.entities;


import java.time.LocalDateTime;
import java.util.UUID;

import com.kminfo.vida_compartilhada.entities.enuns.CareGroupRole;
import com.kminfo.vida_compartilhada.entities.enuns.InvitationStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "invitations")
public class Invitation extends BaseEntity {
	
	  @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "care_group_id")
	    private CareGroup careGroup;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "invited_by_user_id")
	    private User invitedBy;

	    @Column(nullable = false)
	    private String email;

	    @Enumerated(EnumType.STRING)
	    private CareGroupRole role;

	    @Enumerated(EnumType.STRING)
	    private InvitationStatus status = InvitationStatus.PENDING;

	    @Column(nullable = false, unique = true)
	    private String token = UUID.randomUUID().toString();

	    private LocalDateTime expiresAt;

		public CareGroup getCareGroup() {
			return careGroup;
		}

		public void setCareGroup(CareGroup careGroup) {
			this.careGroup = careGroup;
		}

		public User getInvitedBy() {
			return invitedBy;
		}

		public void setInvitedBy(User invitedBy) {
			this.invitedBy = invitedBy;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public CareGroupRole getRole() {
			return role;
		}

		public void setRole(CareGroupRole role) {
			this.role = role;
		}

		public InvitationStatus getStatus() {
			return status;
		}

		public void setStatus(InvitationStatus status) {
			this.status = status;
		}

		public String getToken() {
			return token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public LocalDateTime getExpiresAt() {
			return expiresAt;
		}

		public void setExpiresAt(LocalDateTime expiresAt) {
			this.expiresAt = expiresAt;
		}
	    
	    
	
    
}
