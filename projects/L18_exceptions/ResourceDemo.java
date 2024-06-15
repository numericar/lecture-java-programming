package L18_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ResourceDemo {
    static FileInputStream fi;
    static Scanner sc;

    public static void main(String[] args) {

        try {
            divide();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void divide() throws FileNotFoundException, IOException {
        try {
            String path = Path.of("lectures", "18_exception_handling", "test.txt").toAbsolutePath().toString();
            fi = new FileInputStream(path);
    
            sc = new Scanner(fi);
            
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt());
            }
        } finally {
            fi.close();
            sc.close();
        }
    }

}
