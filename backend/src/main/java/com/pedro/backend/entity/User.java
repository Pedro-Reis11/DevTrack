package com.pedro.backend.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true, length = 320)
    private String email;

    @Column(nullable = false, length = 255)
    private String passworHash;

    public User() {
    }

    public User(String name, String email, String passworHash) {
        this.name = name;
        this.email = email;
        this.passworHash = passworHash;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
