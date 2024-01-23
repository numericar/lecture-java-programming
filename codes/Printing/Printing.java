package Printing;

public class Printing {
    public static void main(String[] args) {
        int x = 10, y = 10;
        float b = 12.55f;
        char c = 'A';
        String str = "Hello";

        System.out.println(x);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);
        System.out.println(x + y);

        System.out.println("Number is " + y);
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println("Sum " + x + y); // ถูกมองว่าเป็น string จึงได้นำ value มา + กัน
        System.out.println("Sum of " + x + " and " + y + " is " + (x + y));
    }
}
