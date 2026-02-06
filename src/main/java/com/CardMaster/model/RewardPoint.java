package model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "RewardPoint")
public class RewardPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RewardID")
    private Long rewardId;

    @Column(name = "AccountID", nullable = false)
    private Long accountId;

    @Column(name = "PointsEarned", nullable = false)
    private Integer pointsEarned;

    @Column(name = "EarnedDate", nullable = false)
    private LocalDate earnedDate;

    @Column(name = "ExpiryDate", nullable = false)
    private LocalDate expiryDate;

    // Getters and setters
    public Long getRewardId() { return rewardId; }
    public void setRewardId(Long rewardId) { this.rewardId = rewardId; }
    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }
    public Integer getPointsEarned() { return pointsEarned; }
    public void setPointsEarned(Integer pointsEarned) { this.pointsEarned = pointsEarned; }
    public LocalDate getEarnedDate() { return earnedDate; }
    public void setEarnedDate(LocalDate earnedDate) { this.earnedDate = earnedDate; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }
}
