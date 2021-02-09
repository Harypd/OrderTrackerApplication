package com.order.tracker.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderTrackerStatusEnum {

    ORDERED("ordered"), SHIPPED("shipped"), DELIVERED("delivered");

    public final String status;

    private OrderTrackerStatusEnum(String status) {
        this.status = status;
    }

    @JsonValue
    public String getValue() {
        return status;
    }

}
