package com.acme.nutrimove.userservices.backend.user.interfaces.rest.resources;

import com.acme.nutrimove.userservices.backend.user.domain.ValueObjects.Privacy;

public record CreateUserResource(
        String name,
        String lastname,
        String email,
        String password,
        Privacy privacy,
        String suscription
) {
    public CreateUserResource {
        if (name == null) throw new NullPointerException("name cannot be null");
        if (lastname == null) throw new NullPointerException("lastname cannot be null");
        if (email == null) throw new NullPointerException("email cannot be null");
        if (password == null) throw new NullPointerException("password cannot be null");
        if (privacy == null) throw new NullPointerException("privacy cannot be null");
        if (suscription == null) throw new NullPointerException("suscription cannot be null");
    }
}
