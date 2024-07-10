package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

// Sorting Employees by Salary in Descending Order and Then by Name in Ascending Order
public class Example9 {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Sagar", 60000));
        employees.add(new Employee("Ankit", 60000));

        // Sort the list of employees
       Collections.sort(employees, Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName));

        // Sort the list of employees
       // Collections.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName, Comparator.reverseOrder()));
       // Collections.sort(employees, Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getName, Comparator.reverseOrder()));


        // Print the sorted list of employees
        System.out.println("Sorted list of employees:");
        employees.forEach(System.out::println);
    }
}
