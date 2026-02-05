package com.CardMaster.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "CARD")
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ID")
    private Long cardId;

    @Column(name = "CARD_NUMBER", nullable = false, unique = true)
    private String cardNumber;

    @Column(name = "CARD_TYPE")
    private String cardType;   // DEBIT / CREDIT

    @Column(name = "CARD_STATUS")
    private String cardStatus; // ACTIVE / BLOCKED

    @Column(name = "EXPIRY_DATE")
    private LocalDate expiryDate;

    @OneToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private CardAccount cardAccount;
}