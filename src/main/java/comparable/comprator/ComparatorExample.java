package comparable.comprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class ComparatorExample {
    public static void main(String[] args) {
        // Create some Person objects
        Human person1 = new Human("Alice", 25);
        Human person2 = new Human("Bob", 30);
        Human person3 = new Human("Charlie", 20);

        // Create a list of Person objects
        List<Human> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Human person : people) {
            System.out.println(person);
        }

        // Sort the list using a lambda expression
        //Collections.sort(people, Comparator.comparingInt(Human::getAge));
        Collections.sort(people, Comparator.comparing(Human::getAge));
       // Collections.sort(people, Comparator.comparing(Human::getName));
        //Collections.sort(people, Comparator.comparing(h->h.getName()));

        // Print the list after sorting
        System.out.println("\nAfter sorting by age:");
        for (Human person : people) {
            System.out.println(person);
        }
    }
}
