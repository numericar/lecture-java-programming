package L25_dateTime;

import java.time.*;

public class DateAndTimeClasses {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt2);

        OffsetDateTime osdt = OffsetDateTime.now();
        System.out.println(osdt);

        MonthDay md = MonthDay.now();
        System.out.println(md);

        Period pr = Period.of(2024, 10, 16);
        System.out.println(pr);
        System.out.println(pr.addTo(LocalDate.now()));

        Instant it = Instant.now();
        System.out.println(it);
    }
}
 