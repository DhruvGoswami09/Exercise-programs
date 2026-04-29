import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double kg = weight * 0.45359237;
        double meters = height * 0.0254;
        System.out.println("BMI: " + (kg / (meters * meters)));
    }
}
