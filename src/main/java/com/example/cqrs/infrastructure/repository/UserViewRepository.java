package com.example.cqrs.infrastructure.repository;

import com.example.cqrs.domain.entities.UserView;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserViewRepository extends JpaRepository<UserView, Long> {}
