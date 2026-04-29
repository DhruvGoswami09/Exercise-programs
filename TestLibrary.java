import java.util.*;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks = 3;

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class TestLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
        try {
            lib.issueBook(sc.nextInt());
            lib.issueBook(sc.nextInt());
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
