package com.dennis.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderRequestDto {
    private Long orderNumber;
    private Long productNumber;
    private Long quantity;
    private Double unitPrice;
}
