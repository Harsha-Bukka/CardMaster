package com.CardMaster.model;

import com.CardMaster.Enum.TransactionChannel;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "TRANSACTION")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TRANSACTION_ID")
    private Long transactionId;

    @Column(name = "TRANSACTION_REF", unique = true)
    private String transactionRef;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "TRANSACTION_TYPE")
    private String transactionType; // DEBIT / CREDIT

    @Column(name = "TRANSACTION_STATUS")
    private String transactionStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "CHANNEL")
    private TransactionChannel channel;


    @Column(name = "TRANSACTION_DATE")
    private LocalDateTime transactionDate;

    @ManyToOne
    @JoinColumn(name = "CARD_ID")
    private Card card;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private CardAccount cardAccount;
}