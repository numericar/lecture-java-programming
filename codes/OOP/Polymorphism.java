package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        SuperClass sp = new SuperClass(10, 30, 50);
        System.out.println(sp.sumData());

        SuperClass sb = new SubClass(10, 30, 50);
        System.out.println(sb.sumData());
    }
}

class SuperClass {
    protected int a;
    protected int b;
    protected int c;

    public SuperClass(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sumData() {
        return (a + b + c);
    }
}

class SubClass extends SuperClass {
    public SubClass(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public int sumData() {
        return (a + b + c) + 10;
    }
}