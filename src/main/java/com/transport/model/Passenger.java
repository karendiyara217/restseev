package com.transport.model;

import jakarta.persistence.*;  // Замените javax.persistence на jakarta.persistence

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;

}
