package com.dennis.application.service;

import com.dennis.application.dto.request.OrderRequestDto;
import com.dennis.application.dto.response.GetAllOrdersResponseDto;
import com.dennis.application.dto.response.GetOrderProcessesResultsResponseDto;
import com.dennis.application.entity.Order;
import com.dennis.application.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public Boolean addOrder(OrderRequestDto orderRequestDto) {
        Order order = Order.builder()
                .orderNumber(orderRequestDto.getOrderNumber())
                .productNumber(orderRequestDto.getProductNumber())
                .quantity(orderRequestDto.getQuantity())
                .unitPrice(orderRequestDto.getUnitPrice())
                .build();
        orderRepository.save(order);
        return true;
    }

    public GetAllOrdersResponseDto getAllOrders() {

       return GetAllOrdersResponseDto.builder()
               .orders(orderRepository.findAll())
               .build();
    }

    public GetOrderProcessesResultsResponseDto getOrderProcessesResults() {
        List<Order> orders = orderRepository.findAll();

        Double result1; // For question 1.a
        Double result2; // For question 1.a
        Double result3; // For question 1.a

        Double result4; // For question 1.b

        Double result5; // For question 1.c
        Double result6; // For question 1.c
        Double result7; // For question 1.c
        Double result8; // For question 1.c
        Double result9; // For question 1.c
        Double result10; // For question 1.c
        Double result11; // For question 1.c

        Map<Long, Map<Long, Long>> result12; // For question 1.d

        result1= orders.stream().filter(order -> order.getOrderNumber() == 1000).mapToDouble(order -> order.getUnitPrice() * order.getQuantity()).sum();
        System.out.println("Question 1.a:" + result1);

        result2= orders.stream().filter(order -> order.getOrderNumber() == 1001).mapToDouble(order -> order.getUnitPrice() * order.getQuantity()).sum();
        System.out.println("Question 1.a:" + result2);

        result3= orders.stream().filter(order -> order.getOrderNumber() == 1002).mapToDouble(order -> order.getUnitPrice() * order.getQuantity()).sum();
        System.out.println("Question 1.a:" + result3);

        result4= orders.stream().mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        System.out.println("Question 1.b:" + result4);

        result5 = orders.stream().filter(order -> order.getProductNumber() == 2000).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        result6 = orders.stream().filter(order -> order.getProductNumber() == 2001).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        result7 = orders.stream().filter(order -> order.getProductNumber() == 2002).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        result8 = orders.stream().filter(order -> order.getProductNumber() == 2003).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        result9 = orders.stream().filter(order -> order.getProductNumber() == 2004).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        result10 = orders.stream().filter(order -> order.getProductNumber() == 2005).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();
        result11 = orders.stream().filter(order -> order.getProductNumber() == 2006).mapToDouble(order -> order.getUnitPrice()).average().getAsDouble();

        System.out.println("Question 1.c:" + result5);
        System.out.println("Question 1.c:" + result6);
        System.out.println("Question 1.c:" + result7);
        System.out.println("Question 1.c:" + result8);
        System.out.println("Question 1.c:" + result9);
        System.out.println("Question 1.c:" + result10);
        System.out.println("Question 1.c:" + result11);

        Map<Long, Map<Long, Long>> groupedOrders = orders.stream().collect(Collectors.groupingBy(Order::getProductNumber, Collectors.groupingBy(Order::getOrderNumber, Collectors.summingLong(Order::getQuantity))));
        result12 = groupedOrders;

        System.out.println("Question 1.d:" + result12);

        return GetOrderProcessesResultsResponseDto.builder()
                .result1(result1)
                .result2(result2)
                .result3(result3)
                .result4(result4)
                .result5(result5)
                .result6(result6)
                .result7(result7)
                .result8(result8)
                .result9(result9)
                .result10(result10)
                .result11(result11)
                .result12(result12)
                .build();
    }
}
