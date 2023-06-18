package com.example.springwebexam.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "price")
    Double price;

    @Column(name = "describe")
    String description;

    @Column(name = "avatar")
    String avatar;
}
