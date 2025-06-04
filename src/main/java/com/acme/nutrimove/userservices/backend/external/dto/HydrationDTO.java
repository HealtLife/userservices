package com.acme.nutrimove.userservices.backend.external.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class HydrationDTO {
    private Long id;
    private Long userId;
    private Double quantity;
    private LocalDateTime createdAt;
}
