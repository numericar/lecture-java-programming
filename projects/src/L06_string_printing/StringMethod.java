package L06_string_printing;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = sc.nextLine();
        sc.close();

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

        // หาตำแหน่งของตัวอักษรที่ระบุภายใน string, ถ้าไม่เจอจะส่งคืน -1
        System.out.println(message.indexOf("H"));

        // หาตำแหน่งของตัวอักษรที่ระบุภายใน string โดยจะเริ่มหาตั้งแต่ index ที่ระบุ, ถ้าไม่เจอจะส่งคืน -1
        System.out.println(message.indexOf("W", 4));

        // หาตำแหน่งของตัวอักษรที่ระบุถายใน string โดยจะเริ่มหาตั้งแต่ตำแหน่งสุดท้ายลงมา
        System.out.println(message.lastIndexOf("."));

        // เปรียบเทียบว่า string มีค่าเท่ากันหรือไม่
        // การใช้งาน == จะเป็นการเปรียบเทียบว่า ค่าทั้ง 2 อยู่ตำแหน่งเดียวกันหรือไม่ใน memory
        // == อาจะได้ค่าเป็น false แม้ค่าจะเหมือนกัน แต่อยู่คนละตำแห่นงของ memory
        System.out.println(message.trim().equals("Hello, Bike"));

        // เปรียบเทียบ string โดยไม่คำนึงถึงตัวอักษรใหญ่หรือเล็ก
        System.out.println(message.equalsIgnoreCase("hello Worlds"));

        // ใช้เปรียบเทียบว่า string มีค่ามากกว่าหรือน้อยกว่า โดยจะเปรียบเทียบกับตัวอักษรด้วย ASCII
        // -1 เมื่อ string ปัจจุบันมีค่าน้อยกว่า
        // 0 เมื่อ string ปัจจุบันมีค่าเท่ากับ
        // 1 เมื่อ string ปัจจุบันมีค่ามากกว่า
        // ในความเป็นจริงจะส่งคืนความแตกต่างของ ASCII
        System.out.println(message.compareTo("He"));

        // แปรง byte, int เป็น string
        System.out.println(String.valueOf(66));

        // การใช้งาน string method จะสร้าง string object ใหม่ขึ้นมาแล้วย้าย reference ไปที่ object ใหม่แทน
        // [string]  [old]
        //    |
        //    |-> [new]
    }
}
