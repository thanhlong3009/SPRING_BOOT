package com.example.demojpa.entity;

import com.example.demojpa.dto.EmployeeDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@SqlResultSetMappings(value = {
        @SqlResultSetMapping(
                name = "resultInfo",
                classes = @ConstructorResult(
                        targetClass = EmployeeDto.class,
                        columns = {
                                @ColumnResult(name = "id"),
                                @ColumnResult(name = "name"),
                                @ColumnResult(name = "email")
                        }
                )
        )
})
@NamedNativeQuery(
        name = "getEmployeeDtoUsingNQ",
        resultSetMapping = "resultInfo",
        query = """
                select id,name,email from employee where email = ?1               
                """)


@Data
@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
