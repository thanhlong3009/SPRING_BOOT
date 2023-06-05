package com.example.demojpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@Entity
@ToString
@Table(name = "student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false,columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(name = "email",nullable = false,unique = true)
    private String email;
}
