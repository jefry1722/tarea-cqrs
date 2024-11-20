package com.example.cqrs.infrastructure.controller;

import com.example.cqrs.application.commands.CreateUserCommand;
import com.example.cqrs.application.queries.GetUserQuery;
import com.example.cqrs.application.services.CreateUserCommandHandler;
import com.example.cqrs.application.services.GetUserQueryHandler;
import com.example.cqrs.domain.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserCommandHandler createUserCommandHandler;
    private final GetUserQueryHandler getUserQueryHandler;

    public UserController(CreateUserCommandHandler createUserCommandHandler, GetUserQueryHandler getUserQueryHandler) {
        this.createUserCommandHandler = createUserCommandHandler;
        this.getUserQueryHandler = getUserQueryHandler;
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody CreateUserCommand command) {
        createUserCommandHandler.handle(command);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = getUserQueryHandler.handle(new GetUserQuery(id));
        return ResponseEntity.ok(user);
    }
}
