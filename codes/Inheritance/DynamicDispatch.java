package Inheritance;

public class DynamicDispatch {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.method1();
        parent.method2();
    }
}

class Parent {
    public void method1() {
        System.out.println("Parent method 1");
    }

    public void method2() {
        System.out.println("Parent method 2");
    }
}

class Child extends Parent {
    @Override
    public void method2() {
        System.out.println("Child method 2");
    }

    public void method3() {
        System.out.println("Child method 3");
    }
}