package com.acme.nutrimove.userservices.backend.external.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodDTO {
    private Long id;
    private Long userId;
    private String name;
    private Double calories;
    private String mealType;
}
