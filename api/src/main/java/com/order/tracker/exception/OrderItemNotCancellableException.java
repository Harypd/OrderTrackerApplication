package com.order.tracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT)
public class OrderItemNotCancellableException extends RuntimeException {
    public OrderItemNotCancellableException(String message) {
        super(message);
    }
}
