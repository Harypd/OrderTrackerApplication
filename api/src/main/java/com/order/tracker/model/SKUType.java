package com.order.tracker.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum  SKUType {
    HARDGOOD("hardgood"), PLAN("plan");

    public final String skuType;

    private SKUType(String skuType) {
        this.skuType = skuType;
    }
    @JsonValue
    public String getValue() {
        return skuType;
    }


}
