package com.example.demo_ajax.entity;

import com.example.demo_ajax.statics.TaskStatus;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    String description;

    TaskStatus status;

    LocalDateTime createdDateTime;

    LocalDateTime expectedEndTime;

    Boolean overdue;

}
