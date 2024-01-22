package CondtionRelational;

public class Relational {
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 4;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
