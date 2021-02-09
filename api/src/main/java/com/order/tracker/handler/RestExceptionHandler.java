package com.order.tracker.handler;

import com.order.tracker.exception.OrderItemNotFoundException;
import com.order.tracker.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(OrderItemNotFoundException.class)
    protected ResponseEntity<Object> handleEntityNotFound(
            OrderItemNotFoundException ex) {

        ApiResponse apiError = new ApiResponse(404, HttpStatus.NOT_FOUND.toString(), ex.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(OrderItemNotFoundException.class)
    protected ResponseEntity<Object> handleOrderItemNotFound(
            OrderItemNotFoundException ex) {

        ApiResponse apiError = new ApiResponse(404, HttpStatus.NOT_FOUND.toString(), ex.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
    }
}
