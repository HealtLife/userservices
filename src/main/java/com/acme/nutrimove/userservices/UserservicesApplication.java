package com.acme.nutrimove.userservices;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableFeignClients(basePackages = "com.acme.nutrimove.userservices.backend.external.clients")
@SpringBootApplication
public class UserservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserservicesApplication.class, args);
    }

}
