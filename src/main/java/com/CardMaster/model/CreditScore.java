package com.CardMaster.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "creditscore")
public class CreditScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scoreId;

    @OneToOne
    @JoinColumn(name = "applicationid", nullable = false, unique = true)
    private CardApplication application;

    private Integer bureauScore;
    private Integer internalScore;

    private LocalDateTime generatedDate = LocalDateTime.now();

    // Getters and Setters
}
