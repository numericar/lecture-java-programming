package Inheritance;

class Super {
    public void display() {
        System.out.println("Super class display");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub class display");
    }
}

public class Overrifing {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.display();

        Sub s = new Sub();
        s.display();
    }
}
