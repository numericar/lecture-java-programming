package L22_lambdaExpressions;

public class LambdaDemo {
    public static void main(String[] args) {
        // () -> {} เป็นการประกาศ lambda expression โดย interface จะต้องเป็น FunctionalInterface เท่านั้น
        MyLamda a = () -> {
            System.out.println("Hello Lambda");
        };

        a.display();
    }
}

// ถ้าหาก interface มีเพียงการทำงานแค่ method เดียว เราจะเรียกว่า FunctionalInterface
@FunctionalInterface
interface MyLamda {
    public void display();
}

class My implements MyLamda {

    @Override
    public void display() {
       System.out.println("Hello World");
    }

}