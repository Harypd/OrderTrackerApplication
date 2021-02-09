package com.order.tracker.model;

import java.io.Serializable;

public class CancelItem implements Serializable {

    private String cancelReason;
    private String cancelDate;

    public CancelItem() {

    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

}
