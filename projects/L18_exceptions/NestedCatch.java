package L18_exceptions;

public class NestedCatch {
    public static void main(String[] args) {
        int numbers[] = { 30, 20, 10, 40, 0 };

        try {
            int c = numbers[0]/numbers[2];

            System.out.println("Division is " + c);
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }

        System.out.println("Successful");
    }
}
