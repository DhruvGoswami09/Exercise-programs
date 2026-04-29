import java.util.*;
import java.io.*;

public class DataStats {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            int chars = 0, words = 0, lines = 0;
            while ((line = br.readLine()) != null) {
                lines++;
                String[] w = line.trim().split("\\s+");
                if(w.length > 0 && !w[0].isEmpty()) words += w.length;
                chars += line.replace(" ", "").length();
            }
            System.out.println("Lines: " + lines + ", Words: " + words + ", Chars: " + chars);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
