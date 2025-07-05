package com.acme.nutrimove.userservices.backend.user.interfaces.rest.transform;


import com.acme.nutrimove.userservices.backend.user.domain.model.commands.CreateUserCommand;
import com.acme.nutrimove.userservices.backend.user.interfaces.rest.resources.CreateUserResource;

public class CreateUserCommandFromResourceAssembler {

    public static CreateUserCommand toCommand(CreateUserResource resource) {
        return new CreateUserCommand(
                resource.getName(),
                resource.getLastname(),
                resource.getEmail(),
                resource.getPassword(),
                resource.getPrivacy(),
                resource.getSubscription()
        );
    }
}
