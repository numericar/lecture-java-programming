package L12_inheritance;

public class ThisSuper {
    int length;
    int breadth;

    public ThisSuper(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length : " + this.length);
        System.out.println("Breadth : " + this.breadth);
    }
}
