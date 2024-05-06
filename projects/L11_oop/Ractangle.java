package L11_oop;

public class Ractangle {
    private double length;
    private double breadth;

    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 0;
        }
    }

    public void setBreadth(double breadth) {
        if (breadth >= 0) {
            this.breadth = breadth;
        } else {
            this.breadth = 0;
        }
    }

    public double area() {
        return this.length * this.breadth;
    }

    public double parimeter() {
        return 2 * (this.length + this.breadth);
    }

    public boolean isSquare() {
        return this.length == this.breadth;
    }
}

class RactangleTest {
    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        ractangle.setLength(10.5);
        ractangle.setBreadth(5.5);

        System.out.println("Area " + ractangle.area());
        System.out.println("Perimeter " + ractangle.parimeter());
        System.out.println("Is is a square " + ractangle.isSquare());
        System.out.println("Length " + ractangle.getLength());
        System.out.println("Breadth " + ractangle.getBreadth());
    }
}