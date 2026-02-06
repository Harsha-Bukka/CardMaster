package  com.CardMaster.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "RewardRedemption")
public class RewardRedemption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RedemptionID")
    private Long redemptionId;

    @Column(name = "AccountID", nullable = false)
    private Long accountId;

    @Column(name = "PointsRedeemed", nullable = false)
    private Integer pointsRedeemed;

    @Column(name = "RedeemedDate", nullable = false)
    private LocalDate redeemedDate;

    @Column(name = "ItemRedeemed", length = 128, nullable = false)
    private String itemRedeemed;

    // Getters and setters
    public Long getRedemptionId() { return redemptionId; }
    public void setRedemptionId(Long redemptionId) { this.redemptionId = redemptionId; }

    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }

    public Integer getPointsRedeemed() { return pointsRedeemed; }
    public void setPointsRedeemed(Integer pointsRedeemed) { this.pointsRedeemed = pointsRedeemed; }

    public LocalDate getRedeemedDate() { return redeemedDate; }
    public void setRedeemedDate(LocalDate redeemedDate) { this.redeemedDate = redeemedDate; }

    public String getItemRedeemed() { return itemRedeemed; }
    public void setItemRedeemed(String itemRedeemed) { this.itemRedeemed = itemRedeemed; }
}