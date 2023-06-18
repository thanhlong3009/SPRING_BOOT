package com.example.demojpa.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private int id;
    private String name;
    private String email;
}


// C1: query entity -> su dung Mapper -> dto
// mapper có thể tự viết hoặc sử dụng thư viện : Object mapper, MapStruct
// C2: JPQL
// C3: Native query
// C4: Sử dụng prọection (interface) -> tự tìm hiểu
