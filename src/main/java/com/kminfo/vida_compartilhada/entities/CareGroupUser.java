package com.kminfo.vida_compartilhada.entities;

import com.kminfo.vida_compartilhada.entities.enuns.CareGroupRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(
    name = "care_group_users",
    uniqueConstraints = {
        @UniqueConstraint(
            columnNames = {"care_group_id", "user_id"}
        )
    }
)
public class CareGroupUser extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "care_group_id", nullable = false)
    private CareGroup careGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CareGroupRole role;

	public CareGroup getCareGroup() {
		return careGroup;
	}

	public void setCareGroup(CareGroup careGroup) {
		this.careGroup = careGroup;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public CareGroupRole getRole() {
		return role;
	}

	public void setRole(CareGroupRole role) {
		this.role = role;
	}
    
    
}