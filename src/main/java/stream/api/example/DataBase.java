package stream.api.example;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static List<Employee> getEmployee(){
        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Roshan","IT",60000));
        list.add(new Employee(2,"Rohit","Finace",100000));
        list.add(new Employee(2,"Rahul","Engineer",80000));
        return list;



    }
}
