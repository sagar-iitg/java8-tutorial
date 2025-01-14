package example2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;


@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    private int id;
    private String name;
    private String city;


    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static Map<String, Long> countEmployeesByCity(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
    }

    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        Employee e1=new Employee(1,"sk","delhi");
        Employee e2=new Employee(2,"mohit","kolkata");
        Employee e3=new Employee(3,"ankit","pune");
        Employee e4=new Employee(4,"ajit","delhi");
        Employee e5=new Employee(5,"mahesh","delhi");
        Employee e6=new Employee(6,"manu","banaglore");
        Employee e7=new Employee(7,"nitin","banaglore");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);


        Map<String, Long> collect = countEmployeesByCity(list);
        System.out.println(collect);


    }
}
