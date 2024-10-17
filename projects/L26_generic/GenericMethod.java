package L26_generic;

public class GenericMethod {
    public static void main(String[] args) {
        show(new String[] { "a", "b", "c", "d" });
    }

    static <T> void show(T[] list) {
        for (T x : list) {
            System.out.println(x);
        }
    }
}
