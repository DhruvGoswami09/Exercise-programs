import java.util.*;

class VolumeCalculator {
    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class TestVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();
        System.out.println(vc.calculateVolume(sc.nextDouble()));
        System.out.println(vc.calculateVolume(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        System.out.println(vc.calculateVolume(sc.nextDouble(), true));
    }
}
