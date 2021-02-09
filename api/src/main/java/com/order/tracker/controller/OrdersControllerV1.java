package com.order.tracker.controller;

import com.order.tracker.model.ApiResponse;
import com.order.tracker.model.CancelItem;
import com.order.tracker.model.OrderSummary;
import com.order.tracker.model.OrderSummaryResponse;
import com.order.tracker.service.OrderActionsService;
import com.order.tracker.service.OrderSummaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrdersControllerV1 {

    @Autowired
    private OrderActionsService orderActionsService;

    @PostMapping("orderactions/cancelItem")
    public ResponseEntity<ApiResponse> cancelOrderItem(@RequestParam("orderId") Long orderId, @RequestParam("itemId") Long itemId,
                                                    @RequestBody CancelItem cancelItem) {

        orderActionsService.cancelOrder(orderId, itemId);
        ApiResponse apiResponse = new ApiResponse(HttpStatus.OK.value(), "OK", "Successful Operation");
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
