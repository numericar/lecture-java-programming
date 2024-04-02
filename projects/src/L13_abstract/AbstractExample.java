package L13_abstract;

public class AbstractExample {
    public static void main(String[] args) {
        Super s = new Sub();
        s.method1();
        s.method2();
    }
}

abstract class Super {
    public Super() {
        System.out.println("Super constructor");
    }

    public void method1() {
        System.out.println("Super method1");
    }

    abstract public void method2();
}

class Sub extends Super {
    @Override
    public void method2() {
       System.out.println("Sub method2");
    }
}
