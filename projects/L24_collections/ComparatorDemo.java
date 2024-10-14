package L24_collections;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
        int b[] = { 2, 4, 6, 8, 1, 3, 5, 7 };

        // เปรียบเทียบว่า 2 array เท่ากันหรือไม่
        System.out.println(Arrays.compare(a, b));

        // คัดลอก array
        int c[] = Arrays.copyOf(a, 4);
        for (int x : c) {
            System.out.print(x);
        }
        System.out.println();

        // deepEquals ใข้กับ array of object 

        // เติมค่าที่กำหนดให้เต็มทุกช่องของ array
        Arrays.fill(c, 10);
        for (int x : c) {
            System.out.print(x);
        }
        System.out.println();

        // mismatch() สามารถบอกได้ว่าจุดไหนของ array ที่ไม่เหมือนกัน

        // parallelSort ใช้เรียงลำดับข้อมูลใน array โดยการทำ multithread โดยมักใช้ข้อมูลที่มีขนาดใหญ่

        Integer d[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
        Arrays.sort(d, new My());

        for (int x : d) {
            System.out.print(x);
        }

    }
}

// ใช้เขียนวิธีที่เราจะเปรียบเทียบ 2 object
class My implements Comparator<Integer> {

    // -1   ใช้ในกรณีต้องการให้ o1 มาก่อน o2
    // 1    ใช้ในกรณีที่ต้องการให้ o2 มาก่อน o1
    // 0    ไม่ต้องทำอะไร

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return -1; // สลับตำแหน่ง [o1, o2] -> [o2, o1] 
        } else if (o1 > o2) {
            return 1; // ไม่ต้องเปลี่ยนแปลง
        } else {
            return 0; // ไม่ต้องเปลี่ยนแปลง
        }
    }

}