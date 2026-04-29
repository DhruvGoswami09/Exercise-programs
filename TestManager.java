import java.util.*;

class BaseEmployee {
    String name, department;
    BaseEmployee(String name, String dept) {
        this.name = name;
        this.department = dept;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", Dept: " + department);
    }
}

class Manager extends BaseEmployee {
    int teamSize;
    Manager(String name, String dept, int size) {
        super(name, dept);
        this.teamSize = size;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

public class TestManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BaseEmployee e = new BaseEmployee(sc.next(), sc.next());
        BaseEmployee m = new Manager(sc.next(), sc.next(), sc.nextInt());
        e.displayDetails();
        m.displayDetails();
    }
}
