package com.acme.nutrimove.userservices.backend.external.clients;

import com.acme.nutrimove.userservices.backend.external.dto.SubscriptionDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "subscriptionservice", path = "/api/v1/subscriptions")
public interface SubscriptionClient {

    @GetMapping("/{id}")
    SubscriptionDTO getSubscriptionById(@PathVariable("id") Long id);
}
