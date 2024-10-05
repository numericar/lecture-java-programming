package L23_ioStream;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Thinkpad\\Desktop\\text.txt"); // read file location
        BufferedInputStream bis = new BufferedInputStream(fis); // store file to buffer
        System.out.println(fis.markSupported());
        System.out.println(bis.markSupported());
        int x;
        while ((x = bis.read()) != -1) {
            System.out.println((char) x);
        }
        bis.close();
    }
}
