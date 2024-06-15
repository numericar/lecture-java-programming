package L18_exceptions;

public class ThrowsThrowDemo {

    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    static int area(int l, int b) throws NegativeDimensionException {
        if (l <= 0 || b <= 0) throw new NegativeDimensionException();

        return l * b;
    }

    static void meth1() throws NegativeDimensionException {
        System.out.println(area(10, 0));
    }

}

class NegativeDimensionException extends Exception {

    @Override
    public String toString() {
        return "Value can't be negative";
    }

}
