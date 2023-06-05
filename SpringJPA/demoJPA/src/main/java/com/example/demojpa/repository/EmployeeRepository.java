package com.example.demojpa.repository;

import com.example.demojpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


    List<Employee> findByDepartment(String department);

    List<Employee> findBySalaryGreaterThan(Long salary);

    List<Employee> findByName(String name);

    List<Employee> findByNameContainingIgnoreCase(String keyword);

    List<Employee>  findByNameStartsWith(String prefix);

    List<Employee> findBySalaryBetween(Long salary1,Long salary2);


}
