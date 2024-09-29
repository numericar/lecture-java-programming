package L23_ioStream;

import java.io.*;

public class ByteDemo {
    public static void main(String[] args) throws IOException {
        byte[] b = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        System.out.println(bis.markSupported());
        bis.close();
        // int x;
        // while ((x = bis.read()) != -1) {
        //     System.out.println((char) x);
        // }

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('d');
        byte[] i = bos.toByteArray();

        for (byte a : i) {
            System.out.println(a);
        }
    }
}
