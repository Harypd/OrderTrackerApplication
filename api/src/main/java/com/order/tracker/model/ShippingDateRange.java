package com.order.tracker.model;

import java.io.Serializable;

public class ShippingDateRange implements Serializable {

    private String description;

    private String fromDate;

    private String toDate;

    public ShippingDateRange() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

}
