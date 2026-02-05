package com.CardMaster.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "portfolioreport")
public class PortfolioReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reportId;

    @Column(nullable = false, length = 50)
    private String scope; // Product/Region/Period

    @Column(columnDefinition = "jsonb")
    private String metrics; // JSON string for flexibility

    @Column(nullable = false)
    private LocalDateTime generatedDate = LocalDateTime.now();


}
