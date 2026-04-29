import java.util.*;

class College {
    String collegeName;

    College(String name) {
        this.collegeName = name;
    }

    class Admission {
        String studentName, course;

        void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            studentName = sc.nextLine();
            course = sc.nextLine();
        }

        void displayDetails() {
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName + ", Course: " + course);
        }
    }
}

public class TestCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College c = new College(sc.nextLine());
        College.Admission a = c.new Admission();
        a.acceptDetails();
        a.displayDetails();
    }
}
