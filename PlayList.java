import java.util.*;

public class Playlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 3; i++) list.add(sc.next());
        System.out.println("Playlist: " + list);
        if (!list.isEmpty()) list.removeFirst();
        System.out.println("After playing first: " + list);
        if (!list.isEmpty()) list.removeLast();
        System.out.println("After skipping last: " + list);
    }
}
