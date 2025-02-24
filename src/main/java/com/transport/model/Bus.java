package com.transport.model;

import jakarta.persistence.*; // Замените javax.persistence на jakarta.persistence

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numberPlate;
    private int capacity;

    // Геттеры и сеттеры
}
