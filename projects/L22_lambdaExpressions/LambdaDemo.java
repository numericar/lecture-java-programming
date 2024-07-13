package L22_lambdaExpressions;

public class LambdaDemo {
    public static void main(String[] args) {
        // () -> {} เป็นการประกาศ lambda expression โดย interface จะต้องเป็น FunctionalInterface เท่านั้น
        // ไม่ต้องระบุ parameter type เพราะว่า complier จะรู้อยู่แล้วโดยอ้างอิงกับ interface, แต่สามารถระบุได้
        MyLamda a = (message) -> {
            System.out.println(message);
        };
        a.display("Hello World");

        // ถ้าหากมีการ return ค่า เราสามารถเรียกใช้งานโดยไม่ต้องระบุ block scope ได้
        MuLambda2 b = (int n1, int n2) -> n1 + n2;
        System.out.println(b.add(10, 10));
    }
}

// ถ้าหาก interface มีเพียงการทำงานแค่ method เดียว เราจะเรียกว่า FunctionalInterface
@FunctionalInterface
interface MyLamda {
    public void display(String message);
}

@FunctionalInterface
interface MuLambda2 {
    public int add(int a, int b);
}

class My implements MyLamda {

    @Override
    public void display(String message) {
       System.out.println("Hello World");
    }

}