package com.example.demojpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false,columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "dob")
    private LocalDate birthday;

    @Column(name = "status")
    private Boolean status;
}
