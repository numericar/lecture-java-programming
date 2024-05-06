package L10_method;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(max(10.0d, 10.2d));
    }

    static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    static float max(float x, float y) {
        return (x > y) ? x : y;
    }

    static double max(double x, double y) {
        return (x > y) ? x : y;
    }
}
