package L19_langpackage;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        Integer b = 10;

        Byte c = 15;
        Byte d = Byte.valueOf("15"); // convert string to byte
       
        Short f = Short.valueOf("123");

        Float g = 12.3f;
        Float h = Float.valueOf("123.5");

        Double j = Double.valueOf(123.456);

        Character k = Character.valueOf('A');

        Boolean l = Boolean.valueOf("true");

        float x = h.floatValue(); // get primitive value type
        float y = h;
    }
}
