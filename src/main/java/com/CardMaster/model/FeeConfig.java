package com.CardMaster.model;

import jakarta.persistence.*;

@Entity
@Table(name = "feeconfig")
public class FeeConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feeId;

    @ManyToOne
    @JoinColumn(name = "productid", nullable = false)
    private CardProduct product;

    private String feeType; // Late / Overlimit / Annual

    private Double amount;

    // Getters and Setters
}
