package com.fernandes.drools.poc.controller;

import com.fernandes.drools.poc.domain.OrderRequest;
import com.fernandes.drools.poc.domain.SumOfOrders;
import org.hibernate.criterion.Order;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Author: Bruno Fernandes
 * Created at : 28/06/2022
 */
@RestController
public class DecisionController {
    private final KieContainer kieContainer;

    public DecisionController(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @PostMapping("/discount")
    private Object[] getDiscountPercent(@RequestBody OrderRequest orderRequest) {
        KieSession kieSession = kieContainer.newKieSession();
        OrderRequest moneyOrder = OrderRequest.builder()
                .orderId(2)
                .paymentType("MONEY")
                .totalPrice(10)
                .discount(10)
                .build();
        SumOfOrders sum = new SumOfOrders();
        Object [] orders = {moneyOrder,orderRequest};
        kieSession.insert(orders);
        kieSession.insert(sum);
        kieSession.fireAllRules();
        kieSession.dispose();
        return orders;
    }
}
