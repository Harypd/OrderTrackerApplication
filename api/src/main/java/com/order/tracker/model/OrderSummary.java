package com.order.tracker.model;

import java.io.Serializable;
import java.util.*;

public class OrderSummary implements Serializable {

    private static final long                   serialVersionUID = -536667180399916600L;
    private              Long                   id;
    private              Long                   orderId;
    private              String                 customerId;
    private              List<OrderSummaryItem> items            = new ArrayList<>();
    private              OrderTrackerStatusEnum status           = OrderTrackerStatusEnum.ORDERED;
    private Boolean        complete         = false;
    private ShipingAddress shipingAddress;


    private List<Shipments> shipments;

    public OrderSummary() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<OrderSummaryItem> getItems() {
        return items;
    }

    public void setItems(List<OrderSummaryItem> items) {
        this.items = items;
    }

    public OrderTrackerStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderTrackerStatusEnum status) {
        this.status = status;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public List<Shipments> getShipments() {
        return shipments;
    }

    public void setShipments(List<Shipments> shipments) {
        this.shipments = shipments;
    }

    public ShipingAddress getShipingAddress() {
        return shipingAddress;
    }

    public void setShipingAddress(ShipingAddress shipingAddress) {
        this.shipingAddress = shipingAddress;
    }

}
