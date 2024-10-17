package L26_generic;

public class GenericDemoTwo {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setData(Integer.valueOf(10));

        System.out.println(d.getData());

        MyArr<Integer> myArr = new MyArr<>();
        myArr.append(10);
        myArr.append(20);
        myArr.display();

        MyArrTwo<Integer, String> arr2 = new MyArrTwo<>();
    }
}

class Data<T> {
    private T obj;

    public void setData(T v) {
        this.obj = v;
    }    

    public T getData() {
        return this.obj;
    }
}

class MyArr<T> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];

    public int length = 0;

    public void append(T v) {
        this.A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.A[i]);
        }
    }
}

class MyArrTwo<T, K> {
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];

    public int length = 0;

    public void append(T v) {
        this.A[length++] = v;
    }

    public void display() {
        for (int i = 0; i < this.length; i++) {
            System.out.println(this.A[i]);
        }
    }
}

class MyArrThree extends MyArr<String> {

}

class MyArrFour<T extends Number> {
    
}