package com.example.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService service = context.getBean(EmployeeService.class);

        service.addEmployee(101, "Sathya", 25000.0);
        service.displayEmployee();
        service.calculateSalary();

        context.close();
    }
}
