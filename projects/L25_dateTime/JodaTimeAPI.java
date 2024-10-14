package L25_dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class JodaTimeAPI {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        System.out.println(LocalDate.now(ZoneId.of("America/Los_Angeles")));

        System.out.println(LocalDate.parse("2020-01-03"));
    }
}
