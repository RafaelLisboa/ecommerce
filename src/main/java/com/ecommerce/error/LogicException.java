package com.ecommerce.error;


import com.ecommerce.exception.IError;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LogicException extends RuntimeException {
    private final HttpStatus httpStatus;
    private final String message;

    public LogicException(final IError error, String... messagesValues) {
        String message = error.getMessage();

        for (String str : messagesValues)
            message = message.replaceFirst("%s" , str);

        this.message = message;
        this.httpStatus = HttpStatus.BAD_REQUEST;
    }


}
