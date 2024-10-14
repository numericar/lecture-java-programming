package L25_dateTime;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // get current milliseconds
        System.out.println("Current millisecond: " + System.currentTimeMillis());

        // Date object จะได้รับ Date and Time
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getDate()); // ดึงวันที่
        System.out.println(date.getDay()); // ดึงว่าวันนี้เป๋นวันที่ลำดับอะไรของสับดาห์

        // Date object แบบระบุวันที่เอง
        // แต่เป็นแบบเก่าแล้ว โดย java ได้เตรียม Java time API ใน Java ไว้ให้แทน
        Date date2 = new Date("1/1/1980");
        System.out.println(date2);

        // ตรวจสอบว่าวันที่ที่ระบุ อยู่หลังจากวันที่ ๆ ต้องการตรวจสอบไหม
        System.out.println(date.after(date2));
    }
}
