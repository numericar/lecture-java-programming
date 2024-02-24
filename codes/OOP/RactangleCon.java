package OOP;

public class RactangleCon {
    private double length;
    private double breadth;

    public RactangleCon() {
        this.length = 1;
        this.breadth = 1;
    }

    public RactangleCon(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public RactangleCon(double s) {
        this.length = breadth = s;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    
}

class RactangleConTest {
    public static void main(String[] args) {
        RactangleCon r1 = new RactangleCon();
        RactangleCon r2 = new RactangleCon(5, 5);
        RactangleCon r3 = new RactangleCon(10);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}
