package com.dennis.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetOrderProcessesResultsResponseDto {
    private Double result1; //Question 1.a
    private Double result2; //Question 1.a
    private Double result3; //Question 1.a

    private Double result4; //Question 1.b

    private Double result5; //Question 1.c
    private Double result6; //Question 1.c
    private Double result7; //Question 1.c
    private Double result8; //Question 1.c
    private Double result9; //Question 1.c
    private Double result10; //Question 1.c
    private Double result11; //Question 1.c

    private Map<Long, Map<Long, Long>> result12; //Question 1.d
}
