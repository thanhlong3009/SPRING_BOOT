package com.example.demojpa;

import com.example.demojpa.entity.Student;
import com.example.demojpa.repository.StudentRepository;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootTest
public class StudentTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private Faker faker;

    @Test
    void  save_student() {
        for (int i = 0; i < 30; i++) {
            Student student = new Student(
                    null,
                    faker.name().fullName(),
                    faker.internet().emailAddress()
            );
            studentRepository.save(student);
        }

    }

    @Test
    void find_All_Pageable() {
        PageRequest request = PageRequest.of(0, 10);
        Page<Student> page = studentRepository.findAll(request);
        page.getContent().forEach(System.out::println);

        PageRequest pageRequest = PageRequest.of(0,10);
        Page<Student>   page1 = studentRepository.findByNameContainingIgnoreCaseUsingNQ("j",pageRequest);
        page1.getContent().forEach(System.out::println);
    }


}
