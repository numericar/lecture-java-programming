package L23_ioStream;

import java.io.FileReader;
import java.io.IOException;

public class FileExampleB {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("C:\\Users\\Thinkpad\\Desktop\\Test.txt")) {
            int x;

            do {
                x = fr.read();
                if (x > -1) {
                    System.out.print(Character.toChars(x));
                }
            } while (x > -1);
        }
    }
}
