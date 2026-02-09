package com.CardMaster.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "Statement")
public class Statement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StatementID")
    private Long statementId;

    @Column(name = "AccountID", nullable = false)
    private Long accountId;

    @Column(name = "PeriodStart", nullable = false)
    private LocalDate periodStart;

    @Column(name = "PeriodEnd", nullable = false)
    private LocalDate periodEnd;

    @Column(name = "TotalDue", precision = 19, scale = 2, nullable = false)
    private BigDecimal totalDue;

    @Column(name = "MinimumDue", precision = 19, scale = 2, nullable = false)
    private BigDecimal minimumDue;

    @Column(name = "GeneratedDate", nullable = false)
    private LocalDate generatedDate;

    @Column(name = "Status", length = 32, nullable = false)
    private String status;

    // Getters and setters
    public Long getStatementId() { return statementId; }
    public void setStatementId(Long statementId) { this.statementId = statementId; }
    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }
    public LocalDate getPeriodStart() { return periodStart; }
    public void setPeriodStart(LocalDate periodStart) { this.periodStart = periodStart; }
    public LocalDate getPeriodEnd() { return periodEnd; }
    public void setPeriodEnd(LocalDate periodEnd) { this.periodEnd = periodEnd; }
    public BigDecimal getTotalDue() { return totalDue; }
    public void setTotalDue(BigDecimal totalDue) { this.totalDue = totalDue; }
    public BigDecimal getMinimumDue() { return minimumDue; }
    public void setMinimumDue(BigDecimal minimumDue) { this.minimumDue = minimumDue; }
    public LocalDate getGeneratedDate() { return generatedDate; }
    public void setGeneratedDate(LocalDate generatedDate) { this.generatedDate = generatedDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}