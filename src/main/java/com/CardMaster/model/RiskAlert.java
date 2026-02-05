package com.CardMaster.model;

import com.CardMaster.model.Transaction;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "riskalert")
public class RiskAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    @ManyToOne
    @JoinColumn(name = "transactionid", nullable = false)
    private Transaction transaction;

    @Column(nullable = false, length = 10)
    private String severity; // Low, Medium, High

    @Column(nullable = false)
    private String flagReason;

    @Column(nullable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

    @Column(nullable = false, length = 20)
    private String status = "Open"; // Open, Investigating, Closed


}
