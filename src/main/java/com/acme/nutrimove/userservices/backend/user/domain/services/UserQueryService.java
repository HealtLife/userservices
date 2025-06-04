package com.acme.nutrimove.userservices.backend.user.domain.services;

import com.acme.nutrimove.userservices.backend.user.domain.model.aggregates.User;
import com.acme.nutrimove.userservices.backend.user.domain.model.queries.GetAllUsersByEmailQuery;
import com.acme.nutrimove.userservices.backend.user.domain.model.queries.GetUserByIdQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {

    List<User> handle(GetAllUsersByEmailQuery query);
    List<User> getAllUsers();
    Optional<User> findById(Long id);
    Optional<User> handle(GetUserByIdQuery query);
}