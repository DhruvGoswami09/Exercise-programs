// File: student/Student.java
package student;
import java.util.*;

public class Student {
    protected int rollNo;
    protected String name;
    
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    public void displayStudent() {
        System.out.println("Roll: " + rollNo + ", Name: " + name);
    }
}

// File: exam/ExamResult.java
package exam;
import student.Student;
import java.util.*;

public class ExamResult extends Student {
    int marks1, marks2, marks3;

    public ExamResult(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1; marks2 = m2; marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        System.out.println("Total: " + total + ", Average: " + (total / 3.0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExamResult res = new ExamResult(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        res.displayResult();
    }
}
