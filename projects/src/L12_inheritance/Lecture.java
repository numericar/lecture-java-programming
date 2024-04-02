package L12_inheritance;

public class Lecture {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.radius = 7;
        cylinder.height = 10;

        System.out.println("Valume " + cylinder.volume());
        System.out.println("Area " + cylinder.area());
    }
}
