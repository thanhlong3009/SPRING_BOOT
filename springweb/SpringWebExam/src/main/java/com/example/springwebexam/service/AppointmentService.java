package com.example.springwebexam.service;

import com.example.springwebexam.model.response.AppointmentResponse;
import com.example.springwebexam.repository.AppointmentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class AppointmentService {
    ObjectMapper objectMapper;

    AppointmentRepository appointmentRepository;

    public List<AppointmentResponse> getAllApointments() {
        return appointmentRepository.findAll()
                .stream()
                .map(appointment -> objectMapper.convertValue(appointment,AppointmentResponse.class))
                .collect(Collectors.toList());
    }
}
