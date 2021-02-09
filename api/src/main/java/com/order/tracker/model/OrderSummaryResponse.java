package com.order.tracker.model;

public class OrderSummaryResponse extends ApiResponse {

    private static final long    serialVersionUID = 4366636978150843630L;
    private OrderSummary orderSummary;

    public OrderSummaryResponse() {

    }

    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    public void setOrderSummary(OrderSummary orderSummary) {
        this.orderSummary = orderSummary;
    }
}
