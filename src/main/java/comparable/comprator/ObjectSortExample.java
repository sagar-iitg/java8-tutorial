package comparable.comprator;

import java.util.Arrays;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Compare persons based on age
        return Integer.compare(this.age,other.age);
       // return this.age>other.age;
       // return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ObjectSortExample {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        };

        Arrays.sort(people); // Sort using natural ordering (based on age)

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
