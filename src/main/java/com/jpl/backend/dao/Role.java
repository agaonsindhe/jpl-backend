/*
 * Copyright (c) 2023.
 */

package com.jpl.backend.dao;


import javax.persistence.*;

/**
 * The type Role.
 */
@Entity
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private ERole name;

  /**
   * Instantiates a new Role.
   */
  public Role() {

  }

  /**
   * Instantiates a new Role.
   *
   * @param name the name
   */
  public Role(ERole name) {
    this.name = name;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public Integer getId() {
    return id;
  }

  /**
   * Sets id.
   *
   * @param id the id
   */
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public ERole getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(ERole name) {
    this.name = name;
  }
}