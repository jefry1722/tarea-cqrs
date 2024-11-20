package com.example.cqrs.infrastructure.repository;

import com.example.cqrs.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}
