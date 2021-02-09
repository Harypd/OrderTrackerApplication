package com.order.tracker.service;

import com.order.tracker.exception.OrderItemNotCancellableException;
import com.order.tracker.exception.OrderItemNotFoundException;
import com.order.tracker.model.OrderSummary;
import com.order.tracker.model.OrderSummaryItem;
import com.order.tracker.model.OrderTrackerStatusEnum;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderActionsService {

    @Autowired
    private OrderSummaryService orderSummaryService;

    public void cancelOrder(Long orderId, Long itemId){

        OrderSummary orderSummary = orderSummaryService.getOrderSummary(orderId);
        Optional<OrderSummaryItem> firstMatch = orderSummary.getItems().stream().filter(orderSummaryItem ->
                orderSummaryItem.getId().equals(itemId)
        ).findFirst();
        if(!firstMatch.isPresent()) {
            throw new OrderItemNotFoundException("Invalid Input or Order/Item Not Found");
        }
        OrderSummaryItem orderSummaryItem = firstMatch.get();

        if(!orderSummaryItem.getStatus().getValue().equals(OrderTrackerStatusEnum.ORDERED.getValue())) {
            throw new OrderItemNotCancellableException("\t\n" + "Order/Item is not in the valid state to cancel. This happens when item is shipped or already canceled.");
        }

    }

}
