package Interface;

public class InterfacePractice2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ITest.meth3();
    }
}

interface ITest {
    int x = 10;
    // dafault ของ interface คือ abstract
    public abstract void meth1(); 
    public abstract void meth2();

    // สามารถมี static method ได้
    public static void meth3() {
        System.out.println("Meth3 of Test");
    }

    // ใน Java 8+ static method สามารถใช้คำว่า default แทนได้
    default void meth9() {
        System.out.println("Meth9 of Test");
    }
}

// สามารถสืบทอด interface กันได้
interface ITest2 extends ITest {
    void math4();
}

class My implements ITest2 {

    @Override
    public void meth1() {
        System.out.println("meth1 of My");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 of My");
    }

    @Override
    public void math4() {
        System.out.println("math4 of My");
    }
    
}