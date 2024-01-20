package StringObject;

public class StringMethod {
    public static void main(String[] args) {
        String message = "   Hello, bike   ";

        // ส่งคืนความยาวของ string
        System.out.println(message.length());

        // เปลี่ยน character ให้เป็นตัวพิมเล็กทั้งหมด
        System.out.println(message.toLowerCase());

        // เปลี่ยน character ให้เป็นตัวพิมใหญ่ทั้งหมด
        System.out.println(message.toUpperCase());

        // ลบ empty string ซ้าย ขวา ออกทั้งหมด
        System.out.println(message.trim());

        // ส่งคืน string ตั้งแต่ index ที่ระบุ
        System.out.println(message.substring(10));

        // ส่งคืน string ตั้งแต่ index ที่ระบุจนถึง index ที่ระบุ
        System.out.println(message.substring(10, 12));

        // แทนที่ตัวอักษรเก่า ด้วยตัวอักษรใหม่ที่ระบุ
        System.out.println(message.replace('l', 'n'));

        // ตรวจสอบว่า string เริ่มต้นด้วย string ที่ระบุหรือไม่
        System.out.println(message.trim().startsWith("Hello"));

        // ตรวจสอบว่า string จบด้วย string ที่ระบุหรือไม่
        System.out.println(message.trim().endsWith("bike"));

        // ส่งคืน character ในตำแหน่งที่ระบุ
        System.out.println(message.charAt(5));
        System.out.println(message.indexOf("Hello"));
        System.out.println(message.trim().equals("Hello, Bike"));
        System.out.println(message.equalsIgnoreCase(" "));
        System.out.println(message.compareTo("He"));
        System.out.println(String.valueOf(66));

        // การใช้งาน string method จะสร้าง string object ใหม่ขึ้นมาแล้วย้าย reference ไปที่ object ใหม่แทน
        // [string]  [old]
        //    |
        //    |-> [new]
    }
}
