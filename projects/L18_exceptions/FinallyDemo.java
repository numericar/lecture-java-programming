package L18_exceptions;

public class FinallyDemo {

    public static void main(String[] args) throws Exception {

        try {
            System.out.println(10 / 0);
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            System.out.println("Final message");
        }

    }

}
