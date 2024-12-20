package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String email;
}
