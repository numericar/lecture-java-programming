package L19_langpackage;

public class WarpperDemo3 {
    public static void main(String[] args) {
        float a = 12.5f;
        Float b = 12.5f / 0;

        System.out.println(b.isInfinite()); // ตรวจสอบว่าเป็นค่า Infinity ไหม (เกิดจากการหารด้วย 0)
        System.out.println();
    }
}
