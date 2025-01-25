package gs.q1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Author {


    private String name;
    private String surname;
    private int age;


}
class Main{

    public static void main(String[] args) {

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Amit", "Sharma", 52));
        authors.add(new Author("Raj", "Verma", 30));
        authors.add(new Author("Vikram", "Patel", 280));
        authors.add(new Author("Pooja", "Singh", 350));
        authors.add(new Author("Anita", "Reddy", 206));
        authors.add(new Author("Rohit", "Gupta", 29));
        authors.add(new Author("Sonal", "Mehta", 31));
        authors.add(new Author("Manish", "Khan", 33));
        authors.add(new Author("Priya", "Iyer", 27));
        authors.add(new Author("Nisha", "Das", 34));

        // Add 15 more authors with random surnames
        authors.add(new Author("Amit", "RandomSurname11", 22));
        authors.add(new Author("Pooja", "RandomSurname12", 300));
        authors.add(new Author("Rohit", "RandomSurname13", 28));
        authors.add(new Author("Sonal", "RandomSurname14", 31));
        authors.add(new Author("Anita", "RandomSurname15", 33));
        authors.add(new Author("Raj", "RandomSurname16", 23));
        authors.add(new Author("Priya", "RandomSurname17", 36));
        authors.add(new Author("Vikram", "RandomSurname18", 32));

        List<String> res = authors.stream().
                filter(i -> i.getAge() > 50).
                map(x -> x.getSurname().toUpperCase()).limit(3).collect(Collectors.toList());

        System.out.println(res);
    }
}


