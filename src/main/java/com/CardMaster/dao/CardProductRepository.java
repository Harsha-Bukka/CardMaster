package com.CardMaster.dao;

import com.CardMaster.model.CardProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardProductRepository extends JpaRepository<CardProduct, Long> {
    CardProduct findByName(String name);
}
