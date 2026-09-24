package com.dto;

import com.enums.Department;

public record EmpDeptStatDto(
        Department department,
        long noOfEmployee
) {

}
