package com.dto;

import com.enums.Branch;

public record EmpSalaryStatDto(
        Branch branch,
        Double salary
) {
}
