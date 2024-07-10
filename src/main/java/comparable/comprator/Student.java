package comparable.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Address {
    private String streetName;
    private String zipCode;

    public Address(String streetName, String zipCode) {
        this.streetName = streetName;
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}

class Student {
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class ComparatorExample1 {
    public static void main(String[] args) {
        // Create some Address objects
        Address address1 = new Address("Street A", "10001");
        Address address2 = new Address("Street B", "10003");
        Address address3 = new Address("Street C", "10002");

        // Create some Student objects with addresses
        Student student1 = new Student("Alice", address1);
        Student student2 = new Student("Bob", address2);
        Student student3 = new Student("Charlie", address3);

        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort the list based on address zip code using a lambda expression
        students.sort(Comparator.comparing(student -> student.getAddress().getZipCode()));

        // Print the list after sorting
        System.out.println("\nAfter sorting by address zip code:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
