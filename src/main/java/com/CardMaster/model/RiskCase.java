package com.cts.model;

import jakarta.persistence.*;

@Entity
@Table(name = "riskcase")
public class RiskCase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long riskCaseId;

    @OneToOne
    @JoinColumn(name = "alertid", nullable = false, unique = true)
    private RiskAlert alert;

    @ManyToOne
    @JoinColumn(name = "investigatorid")
    private User investigator;

    @Column(columnDefinition = "TEXT")
    private String notes;

    @Column(nullable = false, length = 20)
    private String status = "Open"; // Open, Investigating, Closed

    // getters and setters
}
