package map;

import java.util.HashMap;
import java.util.Map;

public class Example {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setRollNumber(101);
        student1.setName("Alice");

        Student student2 = new Student();
        student2.setRollNumber(102);
        student2.setName("Bob");

        // Create addresses
        Address address1 = new Address();
        address1.setStreet("123 Park Street");
        address1.setCity("Mumbai");
        address1.setCountry("India");

        Address address2 = new Address();
        address2.setStreet("456 Hill Road");
        address2.setCity("Delhi");
        address2.setCountry("India");


        Map<Student, Address> studentAddressMap = new HashMap<>();

        // Put entries into the map
        studentAddressMap.put(student1, address1);
        studentAddressMap.put(student2, address2);

        for(Student key: studentAddressMap.keySet()){
            System.out.println(key);
        }
        studentAddressMap.
                entrySet().
                forEach(entry-> System.out.println(entry.getKey()+" "+entry.getValue()));

    }
}
