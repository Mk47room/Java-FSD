package com.service;

import com.dao.EmployeeDao;
import com.dto.EmpDeptStatDto;
import com.dto.EmpSalaryStatDto;
import com.dto.EmployeeRespDto;
import com.enums.Branch;
import com.enums.Department;
import com.enums.SortDirection;
import com.mapper.EmployeeMapper;
import com.model.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();
    public List<Employee> getAllEmployees() {
        List<Employee> list = employeeDao.getAllEmployees();//Unsorted list.
        Collections.sort(list); //sorting with default sort - check model class for logic of sort
        return list;
    }

    public List<Employee> sortEmployeeBySalary(List<Employee> list, SortDirection Direction) {
        if(Direction.equals(SortDirection.ASC))
            list.sort((e1,e2)-> (int) (e1.getSalary()-e2.getSalary()));
        else
            list.sort((e1,e2)-> (int) (e2.getSalary()-e1.getSalary()));
        return list;
    }

    public List<Employee> filterEmployeeByDept(List<Employee> list, Department department) {
        //step 1: convert to stream
        Stream<Employee> stream = list.stream();
        //step 2: perform ops on stream
        stream = stream.filter(e->e.getDepartment().equals(department));
        //e-> e.getDepartment() ---- lamda conversion.
        //step 3: reconvert to list;
        return stream.toList();
    }

    public List<Employee> filterEmployeeByBranch(List<Employee> list, Branch branch) {
        // method chaining
        return list
                .stream()
                .filter(e->e.getBranch().equals(branch))
                .toList();
    }

    public List<String> getEmployeeNames(List<Employee> list) {
        // Lamda conversion replaced by reference in map (not only in map) .
        return list
                .stream()
                .map(Employee::getName)
                .toList();
    }

    public List<EmployeeRespDto> getEmployeeInfo(List<Employee> list) {
        // They are not going to ask for name only. So create a method.
        // (If modify needed  no need to change service layer)

        return list
                .stream()
                .map(EmployeeMapper :: mapModelToDto)
                .toList();
    }

    public List<EmpDeptStatDto> getEmpCountForEachDepartment(List<Employee> list) {
    /*
        //There is no group by in default. It's inside collect() and Collectors class.
        //Here group by takes two args( , ).
        //By simply returning map.(Frontend don't have map type)

        Map<Department,Long> map = list
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        return  map;
    */
        return list
                //take one employee and put in stream(for iteration)
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()))
                //Select Entry set for operate mapping
                .entrySet()
                //take one Entry set and put in stream.
                .stream()
                //Create an object of Dto to map.
                .map(Entry -> new EmpDeptStatDto(Entry.getKey(),Entry.getValue()))
                .toList();

    }

    public List<EmpSalaryStatDto> getTotalSalaryForEachBranch(List<Employee> list) {
        //Collectors has several arithmetic operation.
        // Another Eg; summing instead of counting.
        return list
                .stream()
                .collect(Collectors.groupingBy(Employee::getBranch,
                        Collectors.summingDouble(Employee::getSalary)))
                .entrySet()
                .stream()
                .map(e->new EmpSalaryStatDto(e.getKey(),e.getValue()))
                .toList();

    }

    public double calculateTotalSalary(List<EmpSalaryStatDto> listSalaryDto) {
       return listSalaryDto
                .stream().mapToDouble(EmpSalaryStatDto::salary).sum();
    }
}
