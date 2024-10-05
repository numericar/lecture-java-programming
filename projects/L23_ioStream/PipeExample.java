package L23_ioStream;

import java.io.*;

public class PipeExample {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);

        Producer producer = new Producer(pos);
        Consumer consumer = new Consumer(pis);

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        this.os = o;
    }
    
    @Override
    public void run()
    {
        int couter = 1;
        while (true) {
            try {
                os.write(couter);
                os.flush();

                System.out.println("Producer " + couter);
                System.out.flush();

                couter++;
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        this.is = i;
    }
    
    @Override
    public void run()
    {
        int x;

        while (true) {
            try {
                x = this.is.read();
                System.out.println("Consumer " + x);
                System.out.flush();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
