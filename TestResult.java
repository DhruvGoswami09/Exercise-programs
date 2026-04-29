import java.util.*;

interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {
    public boolean isPassed(int mark) {
        return mark >= 35;
    }

    public String getDivision(double average) {
        if (average >= 60) return "First Division";
        return "Lower Division";
    }
}

public class TestResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();
        System.out.println("Passed? " + r.isPassed(sc.nextInt()));
        System.out.println("Division: " + r.getDivision(sc.nextDouble()));
    }
}
