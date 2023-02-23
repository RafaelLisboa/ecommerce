package com.ecommerce.controller;

import com.ecommerce.entity.Purchase;
import com.ecommerce.service.PurchaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseServiceImpl purchaseService;

    @Autowired
    public PurchaseController(PurchaseServiceImpl purchaseService) {
        this.purchaseService = purchaseService;
    }


    @GetMapping("/{id}")
    public Optional<Purchase> getPurchaseById(@PathVariable Long id) {
        return this.purchaseService.getPurchase(id);
    }

}
