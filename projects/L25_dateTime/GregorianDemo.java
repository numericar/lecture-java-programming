package L25_dateTime;

import java.util.*;

public class GregorianDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        // ตรวจสอบว่าเป็น Leap year หรือไม่
        System.out.println(gc.isLeapYear(2020));

        // ดึงข้อมูลวันที่ ณ ปัจจุบัน
        System.out.println(gc.get(Calendar.DATE));

        // ดึงข้อมูลว่าวันนี้เป้นวันลำดับที่เท่าไหร่ของสัปดาห์ โดยเริ่มต้นที่วันอาทิตย์
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        
        // ดึงข้อมูลว่าวันนี้เป็นวันลำดับที่เท่าไหร่ของปี
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));

        // เปลี่ยน time zone 
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

        // ดีงข้อมูล Timezone
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
    }
}
