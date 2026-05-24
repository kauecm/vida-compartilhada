package com.kminfo.vida_compartilhada.entities;


import java.time.LocalDateTime;
import java.util.List;

import com.kminfo.vida_compartilhada.entities.enuns.RecordCategory;
import com.kminfo.vida_compartilhada.entities.enuns.RecordSeverity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "records")
public class Record extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RecordCategory category;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    private RecordSeverity severity;

    @Column(name = "event_date")
    private LocalDateTime eventDate;

    @OneToMany(mappedBy = "record")
    private List<RecordAttachment> attachments;
}
