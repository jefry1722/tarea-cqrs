package com.example.cqrs.application.services;

import com.example.cqrs.application.commands.CreateUserCommand;
import com.example.cqrs.domain.entities.User;
import com.example.cqrs.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserCommandHandler {
    @Autowired
    private UserRepository userRepository;

    public CreateUserCommandHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void handle(CreateUserCommand command) {
        User user = new User(command.getName(), command.getLastName(),command.getAge());
        userRepository.save(user);
    }
}
