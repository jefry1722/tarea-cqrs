package com.example.cqrs.domain.services;

import com.example.cqrs.domain.entities.User;
import com.example.cqrs.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDomainService {
    private final UserRepository userRepository;

    public UserDomainService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user) {
        userRepository.save(user);
    }
}