package com.CardMaster.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cardproduct")
public class CardProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    private String name;

    private String category; // Standard / Gold / Platinum

    private Double interestRate;

    private Double annualFee;

    private String status = "Active"; // Active / Inactive

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<FeeConfig> feeConfigs = new ArrayList<>();

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();

    // Getters and Setters
}
