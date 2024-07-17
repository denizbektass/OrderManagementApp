package com.dennis.application.dto.response;

import com.dennis.application.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllOrdersResponseDto {

    private List<Order> orders = new ArrayList<>();

}
