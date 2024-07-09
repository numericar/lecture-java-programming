package L19_langpackage;

public class WarpperDemo2 {
    public static void main(String[] args) {
        int m1 = 15;
        
        Integer m2 = m1;
        Integer m3 = 15;
        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));

        Integer m4 = Integer.valueOf("123");
        Integer m5 = Integer.valueOf("A7", 16);

        System.out.println(m4);
        System.out.println(m5);

        System.out.println(Integer.reverse(1234));
    }
}
