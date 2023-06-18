package com.example.springwebexam.entity;

import com.example.springwebexam.statics.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "appointment")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    Integer id;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(name = "description")
    String description;

    @Column(name = "status")
    Status status;

    @Column(name = "created_at")
    LocalDateTime createdAt;

    @Column(name = "confirm_at")
    LocalDateTime confirmAt;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.status = Status.UNCONFIRMED;
    }

    @PreUpdate
    public void preUpdate() {
        this.confirmAt = LocalDateTime.now();
    }
}
