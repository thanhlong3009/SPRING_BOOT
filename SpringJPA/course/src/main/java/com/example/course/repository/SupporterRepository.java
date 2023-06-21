package com.example.course.repository;

import com.example.course.model.Supporter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SupporterRepository extends JpaRepository<Supporter, Integer> {
}