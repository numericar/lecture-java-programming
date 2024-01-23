package StringObject;

public class StringPractice {
    public static void main(String[] args) {
        // "Java Developer" ถูกสร้างขึ้นใน string pool area
        // str1 จะจัดเก็บ reference ไว้ใน heap
        String str1 = "Java Developer";
        String str2 = new String("JAVA");
        String str3 = new String(new char[] {'J', 'a', 'v', 'a', ' ', 'D', 'e', 'v'});
        String str4 = new String(new byte[] {65, 66, 67, 68});

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("Java" == new String("Java"));
    }
}
