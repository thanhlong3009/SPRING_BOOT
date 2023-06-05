package com.example.demojpa.repository;

import com.example.demojpa.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Struct;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Tim kiem theo ten va phan trang
    Page<Student> findByName(String name, Pageable pageable);

    List<Student> findByNameOrderByNameDesc(String name); // Nhanh nhất

    List<Student> findByName(String name,Sort sort); // ap dung cho nhieu trương hợp sắp xếp khác nhau

    // Tim kiem theo ten va chua ky tu gi do khong phan biet hoa thuong
    Page<Student> findByNameContainingIgnoreCase(String name, Pageable pageable);

    // Su dung native query
    @Query(
            nativeQuery = true,
            value = "select  * from student",
            countQuery = "select count((id)) from student"
    )
    Page<Student> getAllStudent(Pageable pageable);

    @Query(
            nativeQuery = true,
            value = "select * from student s where upper(s.name) like upper(concat('%',?1,'%'))",
            countQuery = "select count(s.id) from student s where upper(s.name) like upper(concat('%',?1,'%'))"
    )
    Page<Student> findByNameContainingIgnoreCaseUsingNQ(String keyword, Pageable pageable);

    @Query (
            nativeQuery = true,
            value = "select * from student where name = ?1 order by name desc "
    )
    List<Student> findByNameSort(String name);


}
