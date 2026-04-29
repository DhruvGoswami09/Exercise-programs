import java.util.*;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        if ("aeiou".indexOf(ch) != -1) {
            System.out.println("Vowel");
        } else if (Character.isLetter(ch)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid");
        }
    }
}
