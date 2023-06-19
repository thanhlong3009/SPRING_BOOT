package com.example.springwebexam.model.response;

import com.example.springwebexam.entity.User;
import com.example.springwebexam.statics.Status;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AppointmentResponse {

    Integer id;

    User user;

    String message;

    Status status;

    LocalDateTime createdAt;

    LocalDate appointmentAt;

    LocalDateTime confirmAt;

}

