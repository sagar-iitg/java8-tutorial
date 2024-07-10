package exmple1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {


    private int id;
    private String name;
    private String city;

    public Employee(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

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

    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        Employee e1=new Employee(1,"sk","delhi");
        Employee e2=new Employee(2,"mohit","kolkata");
        Employee e3=new Employee(3,"ankit","pune");
        Employee e4=new Employee(4,"ajit","delhi");
        Employee e5=new Employee(5,"mahesh","delhi");
        Employee e6=new Employee(6,"manu","banaglore");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);


        List<Employee> delhiEmployee = list.stream().
                filter(e -> "delhi".equalsIgnoreCase(e.getCity())).
                sorted( Comparator.comparing(Employee::getName).reversed()  ).toList();

        System.out.println(delhiEmployee);




    }
}
