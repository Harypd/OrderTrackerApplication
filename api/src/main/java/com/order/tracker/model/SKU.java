package com.order.tracker.model;

import java.io.Serializable;

public class SKU implements Serializable {

    private String id;

    private SKUType type = SKUType.HARDGOOD;
    private String  name;

    public SKU() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
