import java.util.*;

public class CompareRectangles {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);
        
        System.out.println(r1.width + " " + r1.height + " " + r1.getArea() + " " + r1.getPerimeter());
        System.out.println(r2.width + " " + r2.height + " " + r2.getArea() + " " + r2.getPerimeter());
        
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 is larger.");
        } else {
            System.out.println("Rectangle 2 is larger.");
        }
    }
}
