package com.CardMaster.model;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String name;
    private LocalDate dob;
    private String contactInfo;
    private Double income;
    private String employmentType;
    private String status;
}