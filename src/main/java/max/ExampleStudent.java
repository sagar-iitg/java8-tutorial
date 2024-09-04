package max;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


@Getter
@AllArgsConstructor
@ToString
class Student{
    private int rollNumber;
    private int age;
    private String name;


}
public class ExampleStudent {

    public static void main(String[] args) {
        List<Student> students= Arrays.asList(new Student(1,17,"Viraj"),
                new Student(2,18,"krishna"),
                new Student(3,21,"Suresh"));


        System.out.println(students);
        Student student = students.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(student);
        Student minAgeStudent = students.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(minAgeStudent);
    }
}
