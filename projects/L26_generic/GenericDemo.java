package L26_generic;

public class GenericDemo<T> {
    T datas[] = (T[]) new Object[3];

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.datas[0] = "Hi";
        gd.datas[1] = "Bye";
        gd.datas[2] = "Eve";

        String str = gd.datas[0];
        System.out.println(str);
    }
}
