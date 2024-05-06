package L18_exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("s");
            System.out.println(number);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("End");
    }
}