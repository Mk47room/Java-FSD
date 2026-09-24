package com.main;

import com.dto.EmpDeptStatDto;
import com.dto.EmpSalaryStatDto;
import com.enums.Branch;
import com.enums.Department;
import com.model.Employee;
import com.service.EmployeeService;

import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        List<Employee> list = employeeService.getAllEmployees();
      list.forEach(System.out :: println);

    /*    System.out.println("-----Sort Employee by Salary ASC");
        List <Employee> listSortedBySalaryAsc = employeeService.sortEmployeeBySalary(list, SortDirection.ASC);
        listSortedBySalaryAsc.forEach(System.out :: println);

        System.out.println("----Filter Employee by Dept------");
        List<Employee> filteredListByDept = employeeService.filterEmployeeByDept(list, Department.DEV);
        filteredListByDept.forEach(System.out :: println);

        System.out.println("-----Filter Employee by Branch-----");
        List<Employee> filteredListByBranch = employeeService.filterEmployeeByBranch(list, Branch.CHENNAI);
        filteredListByBranch.forEach(System.out :: println);


        List<String> listNames = employeeService.getEmployeeNames(list);
        listNames.forEach(System.out :: println);

        List <EmployeeRespDto> listInfo = employeeService.getEmployeeInfo(list);
        listInfo.forEach(System.out :: println);


        List<EmpDeptStatDto> listCountDto = employeeService.getEmpCountForEachDepartment(list);
        listCountDto.forEach(System.out :: println);


        // Compute the total salary of employees for each branch
        List<EmpSalaryStatDto> listSalaryDto = employeeService.getTotalSalaryForEachBranch(list);
        listSalaryDto.forEach(System.out :: println);
        double total = employeeService.calculateTotalSalary(listSalaryDto);
        System.out.println("Total Salary : " + total);

     */
    }
}
