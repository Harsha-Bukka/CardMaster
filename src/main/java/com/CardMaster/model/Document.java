package com.CardMaster.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long documentId;
    @ManyToOne
    @JoinColumn(name = "application_id")
    private CardApplication application;
    private String documentType;
    private String fileURI;
    private LocalDate uploadedDate;
    private String status;
}