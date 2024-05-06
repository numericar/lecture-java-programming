package L06_string_printing;

public class StringRegularExpression {
    public static void main(String[] args) {
        /*
        *   ใช้เพื่อตรวจสอบว่า string นี้เข้าเงื่อนไขรูปแบบที่กำหนดหรือไม่ โดยใช้ regular expression
        *
        *   Matching Symbols
        *   .           -> ตัวอักษร, ตัวเลข, อักจระพิเศษ โดยจะเป็นรูปแบบ single character
        *   [abc]       -> ตัวอักษร เป็น a หรือ b หรือ c
        *   [abc][vz]   -> ตัวอักษรตัวแรกต้องเป็น a หรือ b หรือ c และจังอักษรตัวที่สองต้องเป็น v หรือ z
        *   [^abc]      -> ตัวอักษรจะต้องไม่ใช้ a หรือ b หรือ c
        *   [a-z1-7]    -> ตัวอักษรจะต้องอยู่ระหว่าง a ถึง z หรือ 1 ถึง 7
        *   A|B         -> เป็น A หรือ B ก็ได้
        *   XZ          -> จะต้องเป็น XZ
        *
        *   Meta Characters
        *   \d          -> ต้องเป็นตัวเลข [0-9]
        *   \D          -> ต้องไม่ใช่ตัวเลข ^[0-9]
        *   \s          -> ต้องเป็นช่องว่าง [ ]
        *   \S          -> ต้องไม่ใช่ช่องว่าง ^[ ]
        *   \w          -> ต้องเป็นตัวอักษรหรือตัวเลข [a-zA-Z0-9]
        *   \W          -> ต้องไม่ใช่ตัวอักษรหรือตัวเลข ^[a-zA-Z0-9]
        *
        *   Quantifier
        *   ใช้เพื่อระบุจำนวนสัญลักษณ์ที่ต้องการ
        *   *           -> ตรวจกี่ตัวก็ได้ตั้งแต่ 0 ขึ้นไป
        *   +           -> ตรวจกี่ตัวก็ได้ตั้งแต่ 1 ตัวขึ้นไป
        *   ?           -> ตรวจตั้งแต่ 0 ถึง 1 ตัว
        *   {x}         -> ต้องมีตัวอักษรตามจำนวน x ที่ระบุ
        *   {x,y}       -> ต้องมีมากกว่า x แต่ไม่เกิน y
        *
        * */

        System.out.println("a".matches("."));
        System.out.println("a".matches("[abc]"));
        System.out.println("d".matches("[^abc]]"));
        System.out.println("H".matches("[a-zA-Z0-9]"));
        System.out.println("A1".matches("[a-zA-Z][0-9]"));
        System.out.println("a".matches("a|b"));
        System.out.println("abc".matches("abc"));
        System.out.println("a".matches("\\w"));
        System.out.println("abc3de".matches(".*"));
        System.out.println("abcd4".matches("[a-z]*"));
        System.out.println("aabbcc".matches("[abc]*"));
        System.out.println("a".matches("[abc]+"));
        System.out.println("abcab".matches("[abc]{5}"));
        System.out.println("aaaaaaa".matches("[abc]{3,7}"));
        System.out.println("mintcolorfuls@gmail.net".matches(".*@gmail.com"));
    }
}
