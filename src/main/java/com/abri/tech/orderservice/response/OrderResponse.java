package com.abri.tech.orderservice.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderResponse {

    private int orderId;
    private String orderDetails;
}
