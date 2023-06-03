/*
 * Copyright (c) 2023.
 */

package com.jpl.backend.repository;

import com.jpl.backend.dao.ERole;
import com.jpl.backend.dao.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}