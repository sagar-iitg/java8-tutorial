package date.time.api;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example {

    public static  void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Current time
        LocalTime now = LocalTime.now();
        System.out.println("Current time: " + now);


    }
}
