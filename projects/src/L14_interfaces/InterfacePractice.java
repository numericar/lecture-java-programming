package L14_interfaces;


public class InterfacePractice {
    public static void main(String[] args) {
        Test t = new My();
        t.method1();
        t.method2();
    }
}

interface Test {
    void method1();
    void method2();
}

class My implements Test {

    @Override
    public void method1() {
       System.out.println("method 1");
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }

}