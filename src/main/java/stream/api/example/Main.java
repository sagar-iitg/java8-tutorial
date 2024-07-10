package stream.api.example;

public class Main {

    public static void main(String[] args) {


        DataBase.getEmployee().stream().filter(employee -> employee.getSalary()>70000).forEach(System.out::println);

    }
}
