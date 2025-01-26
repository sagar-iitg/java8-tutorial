package time;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class UTCExample {
    public static void main(String[] args) {
        // Get the current time in UTC
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);
        System.out.println("Current UTC Time: " + utcNow);

        ZonedDateTime istNow=ZonedDateTime.now(ZoneOffset.ofHoursMinutes(5,30));
        System.out.println("ist Time"+istNow);
        
        // Alternatively, using Instant to get the current UTC time
        Instant instant = Instant.now(); // Instant represents a point in time in UTC
        System.out.println("Current UTC Time (Instant): " + instant);
    }
}
