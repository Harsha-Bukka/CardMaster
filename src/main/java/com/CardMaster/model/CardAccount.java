package com.CardMaster.model;

import com.CardMaster.Enum.CardAccountStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "CARD_ACCOUNT")
@Data
public class CardAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCOUNT_ID")
    private Long accountId;

    @Column(name = "ACCOUNT_NUMBER", nullable = false, unique = true)
    private String accountNumber;

    @Column(name = "CREDIT_LIMIT", nullable = false)
    private BigDecimal creditLimit;

    // As per design: AvailableLimit
    @Column(name = "AVAILABLE_LIMIT", nullable = false)
    private BigDecimal availableLimit;

    // As per design: OpenDate
    @Column(name = "OPEN_DATE", nullable = false)
    private LocalDate openDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private CardAccountStatus Status;

    @Column(name = "AVAILABLE_BALANCE")
    private BigDecimal availableBalance;

    @Column(name = "CURRENCY")
    private String currency;

    @OneToOne
    @JoinColumn(name = "CARD_ID", nullable = false)
    private Card card;

    @OneToMany(mappedBy = "cardAccount")
    private List<Transaction> transactions;
}