package com.mapper;

import com.dto.EmployeeRespDto;
import com.model.Employee;

public class EmployeeMapper {
    public static EmployeeRespDto mapModelToDto(Employee employee){
        EmployeeRespDto employeeRespDto = new EmployeeRespDto(
                employee.getId(),
                employee.getName(),
                employee.getDepartment(),
                employee.getJoiningDate()
        );
        return employeeRespDto;
    }
}
