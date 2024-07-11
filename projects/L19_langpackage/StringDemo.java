package L19_langpackage;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String("Hello");

        StringBuffer s2 = new StringBuffer("Hello");

        StringBuilder s3 = new StringBuilder("Hello");

        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1); // ไม่ได้รับ World เพราะเป็นการสร้าง string ใหม่ขึ้นมา
        System.out.println(s2);
        System.out.println(s3);
    }
}
