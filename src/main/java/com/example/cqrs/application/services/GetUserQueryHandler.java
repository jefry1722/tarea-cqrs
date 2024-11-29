package com.example.cqrs.application.services;

import com.example.cqrs.application.queries.GetUserQuery;
import com.example.cqrs.domain.entities.UserView;
import com.example.cqrs.infrastructure.repository.UserViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserQueryHandler {
    @Autowired
    private UserViewRepository userViewRepository;

    public GetUserQueryHandler(UserViewRepository userViewRepository) {
        this.userViewRepository = userViewRepository;
    }

    public UserView handle(GetUserQuery query) {
        return userViewRepository.findById(query.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}

