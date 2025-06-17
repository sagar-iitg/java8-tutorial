package streams.q1;


import lombok.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


@Data
@AllArgsConstructor
class Employee {


    int empId;
    String name;
    int salary;

}
class Main{

    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();

        list.add(new Employee(1, "panka", 100));
        list.add(new Employee(2, "amit", 1090010));
        list.add(new Employee(3, "ankit", 100120));
        list.add(new Employee(4, "mohit", 10000));

        System.out.println(list);
        String highestSalary = list.stream().
                max(Comparator.comparing(Employee::getSalary)).
                map(Employee::getName).orElse("No emp");

        System.out.println(highestSalary);

        Employee highestSalaryEmp = list.stream().
                max(Comparator.comparing(Employee::getSalary)).orElse(null);

        System.out.println(highestSalaryEmp);


    }

}


