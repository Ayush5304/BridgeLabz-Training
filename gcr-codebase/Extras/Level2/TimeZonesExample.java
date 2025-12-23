import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesExample{

    public static void main(String[] args) {

        // GMT -Greenwich Mean Time
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // IST -Indian Standard Time
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // PST -Pacific Standard Time
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display times
        System.out.println("Current Time in GMT " + gmtTime);
        System.out.println("Current Time in IST " + istTime);
        System.out.println("Current Time in PST " + pstTime);
    }
}
