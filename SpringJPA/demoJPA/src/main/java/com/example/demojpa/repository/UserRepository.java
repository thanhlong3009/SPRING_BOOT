package com.example.demojpa.repository;

import com.example.demojpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    // method query
    Optional<User> findAllByEmail(String email);

    // JPQL query
    List<User> findAllByName(String name);

    // phan biet hoa thuong
    List<User> findAllByNameContaining(String keyword);

    // khoong phan biet hoa thuong
    List<User> findAllByNameContainingIgnoreCase(String keyword);

    // bat dau bang ky tu
    List<User> findAllByNameStartsWith(String prefix);

    Optional<User> findByNameAndEmail(String name, String email);

    List<User> findByNameOrEmail(String name, String email);

    long countByName(String name);

    Boolean existsByEmail(String email);

    List<User> findByBirthdayBefore(LocalDate date);
}
