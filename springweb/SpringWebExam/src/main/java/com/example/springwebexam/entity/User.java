package com.example.springwebexam.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    Integer id;

    @Column(name = "name",nullable = false)
    String name;

    @Column(name = "email",nullable = false)
    String phone;

    @Column(name = "email",nullable = false)
    String email;
}
