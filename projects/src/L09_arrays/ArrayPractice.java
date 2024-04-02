package L09_arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = { 1, 2, 3, 4, 5 };    
        int[] c; // declear
        c = new int[10]; // initialize
        int d[] = new int[5];

        b[2] = 15;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        System.out.println(b); // ได้รับตำแหน่งของ object ใน memory แทน
        for (int value : b) {
            System.out.println(value);
        }
    }
}
