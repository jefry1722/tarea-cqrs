package com.example.cqrs.application.services;

import com.example.cqrs.application.queries.GetUserQuery;
import com.example.cqrs.domain.entities.User;
import com.example.cqrs.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetUserQueryHandler {
    @Autowired
    private UserRepository userRepository;

    public GetUserQueryHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User handle(GetUserQuery query) {
        return userRepository.findById(query.getId())
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}

