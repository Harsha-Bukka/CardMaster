package com.CardMaster.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "underwritingdecision")
public class UnderwritingDecision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long decisionId;

    @OneToOne
    @JoinColumn(name = "applicationid", nullable = false, unique = true)
    private CardApplication application;

    @ManyToOne
    @JoinColumn(name = "underwriterid", nullable = false)
    private User underwriter;

    private String decision; // Approve / Reject / Conditional
    private Double approvedLimit;
    private String remarks;

    private LocalDateTime decisionDate = LocalDateTime.now();

    // Getters and Setters
}
