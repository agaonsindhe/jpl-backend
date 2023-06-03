/*
 * Copyright (c) 2023.
 */

package com.jpl.backend.repository;

import com.jpl.backend.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * The interface User repository.
 */
public interface UserRepository extends JpaRepository<UUID, User> {

    /**
     * Find by username optional.
     *
     * @param username the username
     * @return the optional
     */
    Optional<User> findByUsername(String username);

    /**
     * Exists by username boolean.
     *
     * @param username the username
     * @return the boolean
     */
    Boolean existsByUsername(String username);

    /**
     * Exists by email boolean.
     *
     * @param email the email
     * @return the boolean
     */
    Boolean existsByEmail(String email);

}
