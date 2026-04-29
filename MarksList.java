import java.util.*;

public class MarksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 5; i++) marks.add(sc.nextInt());
        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));
    }
}
