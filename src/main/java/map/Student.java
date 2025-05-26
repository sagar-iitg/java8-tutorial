package map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
    private int rollNumber;
    private String name;

    // hashCode() and equals() are important if you're using it as a HashMap key
    @Override
    public int hashCode() {
        return rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return rollNumber == other.rollNumber;
    }
}
