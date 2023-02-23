package com.ecommerce.service;

import com.ecommerce.entity.Purchase;

import java.util.Optional;

public interface PurchaseService {

    Optional<Purchase> getPurchase(Long id);
    Purchase update(Purchase purchase);
    void save(Purchase purchase);


}
