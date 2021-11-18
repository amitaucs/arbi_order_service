package com.abri.tech.orderservice.controller;

import com.abri.tech.orderservice.dto.RestaurantOrder;
import com.abri.tech.orderservice.response.OrderResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant/v1")
@Tag(name="Restaurant order application")
@Api(tags = "Restaurant order application")
public class OrderController {

    @ApiOperation(value = "Create a new order for a customer")
    @ApiResponses(value = {@ApiResponse(code= 500, message = "Internal Server Error"),
            @ApiResponse(code= 200, message = "OK", response = String.class)})
    @PostMapping("/createOrder")
    public ResponseEntity<OrderResponse> createNewOrder(@RequestBody RestaurantOrder restaurantOrder) {

        //ToDo : Need to implement business logic

        var orderResponse = OrderResponse.builder()
                .orderId(123)
                .orderDetails("Veg Burger none spicy")
                .build();

        return ResponseEntity.status(HttpStatus.OK).body(orderResponse);
    }

}
