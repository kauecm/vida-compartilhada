package com.kminfo.vida_compartilhada.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "record_attachments")
public class RecordAttachment extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "record_id")
    private Record record;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "mime_type")
    private String mimeType;

    @ManyToOne
    @JoinColumn(name = "uploaded_by")
    private User uploadedBy;
}
