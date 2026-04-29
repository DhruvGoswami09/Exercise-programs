import java.util.*;

class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

class TableThread extends Thread {
    Table t; int n;
    TableThread(Table t, int n) { this.t = t; this.n = n; }
    public void run() { t.printTable(n); }
}

public class SyncTable {
    public static void main(String[] args) {
        Table obj = new Table();
        new TableThread(obj, 5).start();
        new TableThread(obj, 7).start();
    }
}
