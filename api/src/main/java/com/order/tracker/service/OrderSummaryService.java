package com.order.tracker.service;

import com.order.tracker.exception.OrderItemNotFoundException;
import com.order.tracker.internalclient.OrderSummaryClient;
import com.order.tracker.model.OrderSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class OrderSummaryService {

    @Autowired
    private              OrderSummaryClient orderSummaryClient;
    private static final Logger             LOG = LoggerFactory.getLogger(OrderSummaryClient.class);
    public OrderSummary getOrderSummary(Long orderId) {

        OrderSummary orderSummary = null;
        try {
            orderSummary = orderSummaryClient.getOrderSummaryByOrderId(orderId);
        } catch (URISyntaxException e) {
            LOG.error("Error Occurred while calling WireMock Stub For Order Details");
        }
        if(orderSummary == null || orderSummary.getOrderId() == null) {
            throw new OrderItemNotFoundException("Not a Valid OrderId");
        }
        return orderSummary;
    }
}
