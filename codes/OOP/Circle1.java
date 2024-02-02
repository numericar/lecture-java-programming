package OOP;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class Circle1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 7;

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle.circumference());
    }
}
