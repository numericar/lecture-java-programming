package L12_inheritance;

class Super1 {
    public void display() {
        System.out.println("Super class display");
    }
}

class Sub1 extends Super {
    @Override
    public void display() {
        System.out.println("Sub class display");
    }
}

public class Overrifing {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub1 s = new Sub1();
        s.display();
    }
}
