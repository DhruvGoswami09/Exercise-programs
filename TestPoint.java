import java.util.*;

class Point {
    int x, y;

    Point() {
        x = 5;
        y = 5;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point p1 = new Point();
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Point p3 = new Point(p2);
        p1.display();
        p2.display();
        p3.display();
    }
}
