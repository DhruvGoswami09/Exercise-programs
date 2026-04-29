import java.util.*;

class SeqThread extends Thread {
    int start, end;
    SeqThread(int s, int e) { start = s; end = e; }
    public void run() {
        for (int i = start; i <= end; i++) System.out.print(i + " ");
        System.out.println();
    }
}

public class SequentialPrint {
    public static void main(String[] args) throws InterruptedException {
        SeqThread t1 = new SeqThread(1, 100);
        SeqThread t2 = new SeqThread(101, 200);
        SeqThread t3 = new SeqThread(201, 300);
        t1.start(); t1.join();
        t2.start(); t2.join();
        t3.start(); t3.join();
    }
}
