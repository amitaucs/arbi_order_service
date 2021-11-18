package com.abri.tech.orderservice.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderResponse {
    @NonNull
    @ApiModelProperty(notes = "The order id for the customer's order")
    private int orderId;
    @NonNull
    @ApiModelProperty(notes = "The order details")
    private String orderDetails;
}
