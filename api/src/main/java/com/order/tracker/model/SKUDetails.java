package com.order.tracker.model;

import java.io.Serializable;

public class SKUDetails implements Serializable {

    private String  id;
    private SKUType skuType;
    private String  name;

    public SKUDetails() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SKUType getSkuType() {
        return skuType;
    }

    public void setSkuType(SKUType skuType) {
        this.skuType = skuType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
