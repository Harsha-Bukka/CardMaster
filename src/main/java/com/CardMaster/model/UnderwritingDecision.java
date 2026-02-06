package com.CardMaster.model;

import com.CardMaster.Enum.DecisionTypeEnum;
import com.CardMaster.model.User;
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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DecisionTypeEnum decision;  // Enum instead of String

    private Double approvedLimit;

    private String remarks;

    private LocalDateTime decisionDate = LocalDateTime.now();

    // Getters and Setters
}
