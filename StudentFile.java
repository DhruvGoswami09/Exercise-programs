import java.util.*;
import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            bw.write("1, John, 85\n2, Alice, 90\n3, Bob, 78\n");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
