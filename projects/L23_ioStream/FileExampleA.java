package L23_ioStream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExampleA {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInput = new FileInputStream("C:\\Users\\Thinkpad\\Desktop\\Test.txt")) {
            // available() ดูจำนวนของ byte ทั้งหมด (เหมือน length)
            // byte[] b = new byte[fileInput.available()];
            // fileInput.read(b);

            // String str = new String(b);
            // System.out.println(str);

            int x;
            do {
                x = fileInput.read();

                if (x > -1) {
                    System.out.print(Character.toChars(x));
                }
            } while (x != -1);
        }
    }
}
