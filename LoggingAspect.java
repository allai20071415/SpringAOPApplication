package com.example.employee;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Runs before every method of EmployeeService
    @Before("execution(* com.example.employee.EmployeeService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        String message;
        switch (joinPoint.getSignature().getName()) {
            case "addEmployee":
                message = "Adding employee";
                break;
            case "displayEmployee":
                message = "Displaying employee";
                break;
            case "calculateSalary":
                message = "Calculating salary";
                break;
            default:
                message = joinPoint.getSignature().getName();
        }
        System.out.println("Logging: " + message);
    }
}
