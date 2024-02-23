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
}

class RactangleConTest {
    public static void main(String[] args) {
        RactangleCon r1 = new RactangleCon();
        RactangleCon r2 = new RactangleCon(5, 5);
        RactangleCon r3 = new RactangleCon(10);
    }
}
