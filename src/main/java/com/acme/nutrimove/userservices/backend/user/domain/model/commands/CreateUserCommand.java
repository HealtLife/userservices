package com.acme.nutrimove.userservices.backend.user.domain.model.commands;


public record CreateUserCommand(
        String name,
        String lastname,
        String email,
        String password,
        String privacy,
        String suscription
) {}
