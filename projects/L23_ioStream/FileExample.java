package L23_ioStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/Thinkpad/Desktop/Test.txt");
            String str = "Learn java programming";

            byte[] b = str.getBytes();

            // loop write byte one by one
            for (byte x : b) {
                fileOutputStream.write(x);
                System.out.println(x);
            }
            // fileOutputStream.write(str.getBytes()); // write file with byte
            fileOutputStream.close(); // หยุดการ stream และทำการคืน memory

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
