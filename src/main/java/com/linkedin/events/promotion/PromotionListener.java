package com.linkedin.events.promotion;

import com.linkedin.events.customer.CustomerRegisteredEvent;
import com.linkedin.events.order.OrderCompletedEvent;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
@AllArgsConstructor
public class PromotionListener {
    private final PromotionService promotionService;


    @EventListener(condition = "#event.customer.newsletter")
    public void onRegistrationEvent(CustomerRegisteredEvent event){
        promotionService.applyPromotion(event.getCustomer());
    }

    @EventListener
    public void onOrderCompleted(OrderCompletedEvent event){
        promotionService.calculateRewardPoints(event.getOrder());
    }
}
