import java.util.*;

class Thread1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("T1: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {}
    }
}

class Thread2 extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("T2: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {}
    }
}

public class TestThreads {
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}
