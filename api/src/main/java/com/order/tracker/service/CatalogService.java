package com.order.tracker.service;

import com.order.tracker.internalclient.CatalogClient;
import com.order.tracker.model.SKUDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class CatalogService {

    @Autowired
    private CatalogClient catalogClient;

    public SKUDetails getSku(String skuId) throws URISyntaxException {
        SKUDetails skuDetails = catalogClient.getSKUDetails(skuId);
        return skuDetails;
    }
}
