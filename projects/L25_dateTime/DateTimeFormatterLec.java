package L25_dateTime;

import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class DateTimeFormatterLec {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z Z"); // ตั้งค่ารูปแบบ format ที่ต้องการ
        System.out.println(df.format(zdt)); // แปลงวันที่เป็น format ที่เราตั้งค่าไว้

        LocalDateTime lt = LocalDateTime.now();
        System.out.println(lt.get(ChronoField.DAY_OF_MONTH));
    }
}
