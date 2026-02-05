package com.CardMaster.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "TRANSACTION_HOLD")
@Data
public class TransactionHold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HOLD_ID")
    private Long holdId;

    @OneToOne
    @JoinColumn(name = "TRANSACTION_ID")
    private Transaction transaction;

    @Column(name = "HOLD_REASON")
    private String holdReason;

    @Column(name = "HOLD_DATE")
    private LocalDateTime holdDate;

    @Column(name = "HOLD_STATUS")
    private String holdStatus; // ON_HOLD / RELEASED
}
