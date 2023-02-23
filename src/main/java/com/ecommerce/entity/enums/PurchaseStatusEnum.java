package com.ecommerce.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PurchaseStatusEnum {
    CREATED(1),
    PROCESSING(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5)
    ;


    private final Integer id;
}
