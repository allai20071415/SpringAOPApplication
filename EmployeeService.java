package com.example.employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private int id;
    private String name;
    private double salary;

    public void addEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Employee added: " + name);
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}
