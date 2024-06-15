package L18_exceptions;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10, b = 0, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input a value: ");
        a = sc.nextInt();

        System.out.print("Input b value: ");
        b = sc.nextInt();

        sc.close();

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Demoninator should not be 0, try again");
            System.err.println(e); // get original error message
        }

        System.out.println("Bye");
    }
}
