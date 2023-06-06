package com.fernandes.drools.poc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Author: Bruno Fernandes
 * Created at : 28/06/2022
 */
@Builder
@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class SumOfOrders {
    private long sumOfPrices;
}
