package com.ecommerce.error.handler;

import com.ecommerce.error.LogicException;
import org.apache.tomcat.util.codec.binary.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(LogicException.class)
    public ResponseEntity<LogicException> handleLogicException(LogicException logicException) {
        return new ResponseEntity<>(logicException, HttpStatus.BAD_REQUEST);
    }


}
