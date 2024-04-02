package L12_inheritance;

public class OverridingRules {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Super {
    public void display() {
        System.out.println("Super display");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub display");
    }
}
