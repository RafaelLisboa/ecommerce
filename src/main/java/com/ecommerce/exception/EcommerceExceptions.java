package com.ecommerce.exception;

import com.ecommerce.error.LogicException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EcommerceExceptions implements IError {

    NO_PRODUCT_STOCK("There are no %s in stock", LogicException.class),

    ;


    private final String message;
    private final Class<?> error;

}
