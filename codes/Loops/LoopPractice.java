package Loops;

public class LoopPractice {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("While: ");
        while (i < 100) {
            System.out.println(i);
            i *= 2;
        }

        System.out.println("\nDo while:");
        i = 1;
        do {
            System.out.println(i);
            i *= 2;
        } while (i < 100);
    }
}