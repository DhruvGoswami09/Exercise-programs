import java.util.*;

public class CLIException {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);
            System.out.println("Result: " + (num / den));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide two arguments");
        } catch (NumberFormatException e) {
            System.out.println("Provide integers");
        }
    }
}
