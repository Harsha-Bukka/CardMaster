package com.CardMaster.model;

import com.CardMaster.Enum.CardApplicaltionEnum;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
public class CardApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long applicationId;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Double requestedLimit;

    private LocalDate applicationDate;

    @Enumerated(EnumType.STRING)
    private CardApplicaltionEnum status;

}
