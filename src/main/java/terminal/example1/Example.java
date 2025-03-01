package terminal.example1;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@ToString
@Getter
class Employee {
    private int id;
    private String name;
    private  double salary;
}


public class Example {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(2, "Alice", 60000),
                new Employee(3, "Bob", 55000)
        );

        Optional<Employee> firstEmp =
                employees.stream().
                filter(e -> e.getSalary() > 59999).
                findFirst();

        System.out.println(firstEmp.get());


    }
}
