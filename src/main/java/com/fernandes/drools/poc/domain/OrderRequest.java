package com.fernandes.drools.poc.domain;

import lombok.*;

/**
 * Author: Bruno Fernandes
 * Created at : 28/06/2022
 */
@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    private Integer orderId;
    private String paymentType;
    private Integer totalPrice;
    private Integer discount;

}
