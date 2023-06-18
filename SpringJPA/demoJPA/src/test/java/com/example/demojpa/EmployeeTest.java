package com.example.demojpa;

import com.example.demojpa.dto.EmployeeDto;
import com.example.demojpa.entity.Employee;
import com.example.demojpa.mapper.EmployeeMapper;
import com.example.demojpa.repository.EmployeeRepository;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@SpringBootTest
public class EmployeeTest {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Faker faker;

    @Test
    void save_employee() {
        Random rd = new Random();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setName(faker.name().fullName());
            employee.setEmail(faker.internet().emailAddress());
            employee.setPassword(faker.internet().password());

            employeeRepository.save(employee);
        }
    }

    @Test
    void query_dto_mapper() {
        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList = employeeList.stream().map(employee -> EmployeeMapper.toEmployeeDto(employee)).collect(Collectors.toList());

        employeeDtoList.forEach(System.out::println);
    }


    @Test
    void query_dto_3rd() {
        ModelMapper mapper = new ModelMapper();

        List<Employee> employeeList = employeeRepository.findAll();
        List<EmployeeDto> employeeDtoList = employeeList.stream().map(employee -> mapper.map(employee, EmployeeDto.class)).collect(Collectors.toList());

        employeeDtoList.forEach(System.out::println);
    }

    @Test
    void query_dto_jpql() {
        EmployeeDto employeeDto  = employeeRepository.getEmployeeDtoByEmail("homer.kovacek@yahoo.com");
        System.out.println(employeeDto);
    }

    @Test
    void query_dto_native() {
        EmployeeDto employeeDto  = employeeRepository.getEmployeeDtoUsingNQ("homer.kovacek@yahoo.com");
        System.out.println(employeeDto);
    }
}
