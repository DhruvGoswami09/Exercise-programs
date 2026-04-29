import java.util.*;

public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rolls = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<String> names = new LinkedList<>(Arrays.asList("A", "B", "C"));
        System.out.println(searchElement(rolls, 2));
        System.out.println(searchElement(names, "D"));
    }
}
