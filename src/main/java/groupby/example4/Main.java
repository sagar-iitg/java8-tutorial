package groupby.example4;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "Engineering", 75000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "Engineering", 80000),
            new Employee("Eve", "Sales", 60000)
        );

        Map<String, Integer> totalSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,                       // Classifier
                Collectors.summingInt(Employee::getSalary)));  // Downstream collector

        System.out.println(totalSalaryByDept);
    }
}
