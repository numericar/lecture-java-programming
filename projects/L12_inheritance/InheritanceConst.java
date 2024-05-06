package L12_inheritance;

public class InheritanceConst {
    public static void main(String[] args) {
        Child1 c = new Child1(4);
        System.out.println(c);
    }
}

class Parent1 {
    public Parent1() {
        System.out.println("Parent Constructor");
    }

    public Parent1(int x) {
        System.out.println("Param of Parent Constructor");
    }
}

class Child1 extends Parent1 {
    public Child1() {
        System.out.println("Child Constructor");
    }

    public Child1(int x) {
        super(4);
        System.out.println("Param of Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("GrandChild Constructor");
    }
    public GrandChild(int x) {
        System.out.println("Param of GrandChild Constructor");
    }
}
