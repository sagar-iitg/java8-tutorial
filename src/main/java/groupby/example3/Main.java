package groupby.example3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "Engineering"),
            new Employee("Charlie", "HR"),
            new Employee("David", "Engineering"),
            new Employee("Eve", "Sales")
        );

        Map<String, Set<String>> employeeNamesByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,         // Classifier
                TreeMap::new,                    // Supplier (TreeMap)
                Collectors.mapping(Employee::getName, Collectors.toSet()))); // Downstream

        System.out.println(employeeNamesByDept);
    }
}
