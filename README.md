# SpringAOPApplication
# Employee Application (Spring AOP)

A simple Employee Application built with the Spring Framework. It performs basic employee operations and uses Spring AOP to log a message automatically before every service method runs. Configuration is annotation-based (no XML).

## Features

- Add an employee
- Display employee details
- Calculate / display salary
- Automatic logging before each service method using `@Aspect` and `@Before`

## Technologies Used

- Java 17
- Spring Framework 6.1.14 (spring-context, spring-aspects)
- AspectJ Weaver 1.9.22
- Maven

## Project Structure

```
employee-app
├── pom.xml
└── src/main/java/com/example/employee
    ├── AppConfig.java          -> Annotation-based Spring configuration
    ├── Main.java               -> Application entry point
    ├── EmployeeService.java    -> Employee operations (service layer)
    └── LoggingAspect.java      -> Logging advice before service methods
```

## File Descriptions

| File | Purpose |
|------|---------|
| `pom.xml` | Maven build file with Spring and AspectJ dependencies |
| `AppConfig.java` | `@Configuration` class with `@ComponentScan` and `@EnableAspectJAutoProxy` |
| `Main.java` | Creates the Spring context, gets the `EmployeeService` bean and calls its methods |
| `EmployeeService.java` | `@Service` with `addEmployee()`, `displayEmployee()` and `calculateSalary()` |
| `LoggingAspect.java` | `@Aspect` that prints a log message before each `EmployeeService` method |

## How It Works

1. `Main` loads the Spring container using `AnnotationConfigApplicationContext(AppConfig.class)`.
2. `@ComponentScan` registers `EmployeeService` and `LoggingAspect` as beans.
3. `@EnableAspectJAutoProxy` makes Spring wrap `EmployeeService` in a proxy.
4. Whenever a service method is called, the `@Before` advice in `LoggingAspect` runs first and prints the log line.

## How to Run

### Eclipse
1. File -> Import -> Maven -> Existing Maven Projects -> select the `employee-app` folder.
2. Right-click the project -> Maven -> Update Project (tick Force Update).
3. Right-click `Main.java` -> Run As -> Java Application.

### Command line
```
mvn compile exec:java
```

Requires JDK 17 or higher and Maven.

## Expected Output

```
Logging: Adding employee
Employee added: Sathya
Logging: Displaying employee
Employee ID: 101
Employee Name: Sathya
Logging: Calculating salary
Employee Salary: 25000.0
```
