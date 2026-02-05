package domain;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentID")
    private Long paymentId;

    @Column(name = "AccountID", nullable = false)
    private Long accountId;

    @Column(name = "Amount", precision = 19, scale = 2, nullable = false)
    private BigDecimal amount;

    @Column(name = "PaymentDate", nullable = false)
    private LocalDate paymentDate;

    @Column(name = "Method", length = 32, nullable = false)
    private String method;

    @Column(name = "Status", length = 32, nullable = false)
    private String status;

    // Getters and setters (no Lombok needed)
    public Long getPaymentId() { return paymentId; }
    public void setPaymentId(Long paymentId) { this.paymentId = paymentId; }

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}