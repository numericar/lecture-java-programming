package Printing;

public class PrtintFormat {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.56f;
        char z = 'A';
        String str = "Java Program";

        System.out.printf("Hello %x %f %c %s World\n", x, y, z, str);
        System.out.printf("%5d\n", x);
        System.out.printf("%.2f\n", y);
        System.out.printf("%-20s", str);
    }
}
