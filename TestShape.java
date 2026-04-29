import java.util.*;

class Shape {
    double d1, d2;
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

class RectangleShape extends Shape {
    double area() {
        return d1 * d2;
    }
}

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        t.getData(sc.nextDouble(), sc.nextDouble());
        System.out.println("Triangle Area: " + t.area());

        RectangleShape r = new RectangleShape();
        r.getData(sc.nextDouble(), sc.nextDouble());
        System.out.println("Rectangle Area: " + r.area());
    }
}
