package Method;

public class VariableArgs {
    public static void main(String[] args) {
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(new int[] { 10, 20, 30, 40, 50 })); // anonymouse array จะถูกสร้างขึ้นแบบลอย ๆ และจะถูกทำงานทันทีเมื่อทำงานเสร็จ
    }

    static int sum(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
