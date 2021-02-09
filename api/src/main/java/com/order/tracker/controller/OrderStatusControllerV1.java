package com.order.tracker.controller;

import com.order.tracker.model.OrderSummary;
import com.order.tracker.model.ApiResponse;
import com.order.tracker.model.OrderSummaryResponse;
import com.order.tracker.service.OrderSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrderStatusControllerV1 {

    @Autowired
    private OrderSummaryService orderSummaryService;

    @GetMapping("orderstatus/order/{orderId}")
    public ResponseEntity<ApiResponse> getOrderStatus(@PathVariable("orderId") Long orderId) {
        OrderSummaryResponse orderSummaryResponse = new OrderSummaryResponse();
        OrderSummary orderSummary = orderSummaryService.getOrderSummary(orderId);
        orderSummaryResponse.setOrderSummary(orderSummary);

        return new ResponseEntity<>(orderSummaryResponse, HttpStatus.OK);
    }
}
