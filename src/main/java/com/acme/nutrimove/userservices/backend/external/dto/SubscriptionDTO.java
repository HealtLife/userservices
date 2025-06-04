package com.acme.nutrimove.userservices.backend.external.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class SubscriptionDTO {
    private Long id;
    private Long userId;
    private String plan;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
