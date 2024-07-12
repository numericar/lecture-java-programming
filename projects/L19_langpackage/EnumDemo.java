package L19_langpackage;

public class EnumDemo {
    public static void main(String[] args) {
        Dept d = Dept.CS;

        // ดึงชื่อของข้อมูล
        System.out.println(d.name());
        
        // ดึงลำดับของข้อมูลใน enum, เริ่มต้นตำแหน่งที่ 0
        System.out.println(d.ordinal());

        // ดึงชื่อของข้อมูลออกมาในรูปแบบของ array
        Dept[] list = Dept.values();
        for (Dept value: list) {
            System.out.println(value);
        }

        switch (d) {
            case CS: System.out.println("CS"); break;
            case IT: System.out.println("IT"); break;
            case CIVIL: System.out.println("Civil"); break;
            case ECE: System.out.println("ECE"); break;
            default: System.out.println("Not found");
        }

        d.display();
    }
}

enum Dept {
    CS, 
    IT,
    CIVIL,
    ECE;
    
    // constructor ต้องเป็น private or default
    // constructor of enum, ใช้สำหรับกำหนดค่าเริ่มต้นให้กับ enum
    private Dept() {
        System.out.println(this.name() + " <");
    }

    // method อื่น ๆ สามารถเป็น public ได้
    public void display() {
        System.out.println("Display: " + this.ordinal());
    }
}
