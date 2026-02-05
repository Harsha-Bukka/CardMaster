package com.CardMaster.dao;

import com.CardMaster.model.FeeConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FeeConfigRepository extends JpaRepository<FeeConfig, Long> {
    List<FeeConfig> findByProduct_ProductId(Long productId);
}
