package com.CardMaster.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Data
@Entity
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auditId;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String action;
    private String resource;
    private LocalDateTime timestamp;
    private String metadata;
}