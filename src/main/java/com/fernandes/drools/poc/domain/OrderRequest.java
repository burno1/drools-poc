package com.fernandes.drools.poc.domain;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Author: Bruno Fernandes
 * Created at : 28/06/2022
 */
@Data
@RequiredArgsConstructor
public class OrderRequest {
    private Integer orderId;
    private String paymentType;
    private Integer totalPrice;
    private Integer discount;


}
