package L23_ioStream;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // open stream from file as input stream [file] -> [program]
            FileInputStream fi = new FileInputStream("C:\\Users\\Thinkpad\\Desktop\\source_1.txt");
            
            // open stream from file as input stream [program] -> [file]
            FileOutputStream fo = new FileOutputStream("C:\\Users\\Thinkpad\\Desktop\\source_2.txt");

            // create instance for store bytes from copy file
            byte[] bytes = new byte[fi.available()];

            // read from copy file, store to byte array
            fi.read(bytes);

            // write a bytes from copy file to past file
            fo.write(bytes);

            // close stream
            fi.close();
            fo.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
