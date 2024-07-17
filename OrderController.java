package com.dennis.application.controller;


import com.dennis.application.dto.request.OrderRequestDto;
import com.dennis.application.dto.response.GetAllOrdersResponseDto;
import com.dennis.application.dto.response.GetOrderProcessesResultsResponseDto;
import com.dennis.application.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
@CrossOrigin("*")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/addOrder")
    public ResponseEntity<Boolean> addOrder(@RequestBody OrderRequestDto orderRequestDto) {
        return ResponseEntity.ok(orderService.addOrder(orderRequestDto));
    }

    @GetMapping("/getAllOrders")
    public ResponseEntity<GetAllOrdersResponseDto> getAllOrders() {
        return ResponseEntity.ok(orderService.getAllOrders());
    }

    @GetMapping("/getOrderProcessesResults")
    public ResponseEntity<GetOrderProcessesResultsResponseDto> getOrderProcessesResults() {
        return ResponseEntity.ok(orderService.getOrderProcessesResults());
    }
}
