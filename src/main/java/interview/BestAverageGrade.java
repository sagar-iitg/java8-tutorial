package interview;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@AllArgsConstructor
@Getter
@ToString
class Student{
    private String name;
    private String grade;

}
public class BestAverageGrade {

    public static void main(String[] args) {

        String[][] input={{"Bob","87"},{"Mike","52"},{"Jason","35"},{"Mike","55"},{"Jessica","99"}};

        List<Student> studentList=Arrays.stream(input).
                map(s->new Student(s[0],s[1])).
                collect(Collectors.toList());

        System.out.println(studentList);

        Map<String,Double> avg=studentList.stream().
                collect(Collectors.groupingBy(Student::getName,
                        Collectors.averagingInt(x->Integer.parseInt(x.getGrade()))));

        System.out.println(avg);
        int ans = avg.values().stream().mapToInt(avg1->(int)Math.floor(avg1)).max().orElse(-1);
        System.out.println(ans);


    }
}
