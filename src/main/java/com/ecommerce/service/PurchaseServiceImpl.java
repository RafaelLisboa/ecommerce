package com.ecommerce.service;

import com.ecommerce.entity.Purchase;
import com.ecommerce.entity.enums.PurchaseStatusEnum;
import com.ecommerce.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PurchaseServiceImpl implements PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }


    @Override
    public Optional<Purchase> getPurchase(Long id) {
        return purchaseRepository.findById(id);
    }

    @Override
    public Purchase update(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    @Override
    public void save(Purchase purchase) {
        purchaseRepository.save(purchase);
    }


}
