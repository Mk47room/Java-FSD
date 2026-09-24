package com.model;

import com.enums.Branch;
import com.enums.Department;

import java.time.LocalDate;

public class Employee implements Comparable <Employee> {
    private int id;
    private String name;
    private Branch branch;
    private String city;
    private Department department;
    private LocalDate joiningDate;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, Branch branch, String city, Department department, LocalDate joiningDate, double salary) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.city = city;
        this.department = department;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch=" + branch +
                ", city='" + city + '\'' +
                ", department=" + department +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee e2) {//Criteria for Default Sorting.

        return e2.joiningDate.compareTo(this.joiningDate);

        // e1 e2 list e1.compareTo(e2) -- access the caller (e1) inside method using this
    }
}
