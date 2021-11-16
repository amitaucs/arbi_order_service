package com.abri.tech.orderservice.controller;

import com.abri.tech.orderservice.dto.RestaurantOrder;
import com.abri.tech.orderservice.response.OrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant/v1")
public class OrderController {

    @PostMapping("/createOrder")
    public ResponseEntity<OrderResponse> createNewOrder(@RequestBody RestaurantOrder restaurantOrder) {

        //ToDo : Need to implement business logic

        var orderResponse = OrderResponse.builder()
                .orderId(123)
                .orderDetails("Chicken Burger")
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(orderResponse);
    }

}
