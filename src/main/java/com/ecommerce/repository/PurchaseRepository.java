package com.ecommerce.repository;

import com.ecommerce.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("purchase")
public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
