package com.dto;

import com.enums.Department;
import java.time.LocalDate;

public record EmployeeRespDto(
        int id,
        String name,
        Department department,
        LocalDate joiningDate
) {
}
