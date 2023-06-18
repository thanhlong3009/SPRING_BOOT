package com.example.springwebexam.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders_details")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;

    @OneToOne
    @JoinColumn(name = "produc_id")
    Product product;

    @Column(name = "quantity")
    Integer quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    Order order;

}
