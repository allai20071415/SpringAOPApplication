package com.example.employee;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Annotation-based Spring configuration (replaces applicationContext.xml).
 */
@Configuration
@ComponentScan(basePackages = "com.example.employee")
@EnableAspectJAutoProxy
public class AppConfig {
}
