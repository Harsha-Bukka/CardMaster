package com.cts.model;

import com.CardMaster.model.User;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @ManyToOne
    @JoinColumn(name = "userid", nullable = false)
    private User user;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false, length = 20)
    private String category; // Payment, Transaction, Risk, Offer

    @Column(nullable = false, length = 20)
    private String status = "Unread"; // Unread, Read, Dismissed

    @Column(nullable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

    // getters and setters
}
