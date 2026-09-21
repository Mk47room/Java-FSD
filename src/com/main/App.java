package com.main;

import com.model.Employee;
import com.service.CustomerService;

import java.util.List;

public class App {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        List<Employee> list =  customerService.getAllEmployees();
        list.forEach(System.out :: println);
    }
}