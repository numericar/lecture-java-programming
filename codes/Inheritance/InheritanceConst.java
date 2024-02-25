package Inheritance;

public class InheritanceConst {
    public static void main(String[] args) {
        Child c = new Child(4);
    }
}

class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }

    public Parent(int x) {
        System.out.println("Param of Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }

    public Child(int x) {
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
