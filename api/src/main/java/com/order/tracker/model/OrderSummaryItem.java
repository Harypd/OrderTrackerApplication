package com.order.tracker.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class OrderSummaryItem implements Serializable {

    private static final long serialVersionUID = -5718819541536254319L;
    private Long              id;
    private String            name;
    private String  planId;
    private String  skuId;
    private Integer quantity;
    private String  telephoneNumber;
    private OrderTrackerStatusEnum status;
    private Boolean                complete;
    private ShippingDateRange      estimatedShipDateRange;
    private ShippingDateRange      newEstimatedShipDateRange;
    private Boolean                userAcceptedDelay;
    private String                 delayAcceptedDate;

    public OrderSummaryItem() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Boolean getUserAcceptedDelay() {
        return userAcceptedDelay;
    }

    public void setUserAcceptedDelay(Boolean userAcceptedDelay) {
        this.userAcceptedDelay = userAcceptedDelay;
    }

    public String getDelayAcceptedDate() {
        return delayAcceptedDate;
    }

    public void setDelayAcceptedDate(String delayAcceptedDate) {
        this.delayAcceptedDate = delayAcceptedDate;
    }
    public ShippingDateRange getEstimatedShipDateRange() {
        return estimatedShipDateRange;
    }

    public void setEstimatedShipDateRange(ShippingDateRange estimatedShipDateRange) {
        this.estimatedShipDateRange = estimatedShipDateRange;
    }

    public ShippingDateRange getNewEstimatedShipDateRange() {
        return newEstimatedShipDateRange;
    }

    public void setNewEstimatedShipDateRange(ShippingDateRange newEstimatedShipDateRange) {
        this.newEstimatedShipDateRange = newEstimatedShipDateRange;
    }
    public OrderTrackerStatusEnum getStatus() {
        return status;
    }

    public void setStatus(OrderTrackerStatusEnum status) {
        this.status = status;
    }
}
