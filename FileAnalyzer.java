import java.util.*;
import java.io.*;

public class FileAnalyzer {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) return;
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        int chars = 0, words = 0, lines = 0;
        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();
            String[] w = line.trim().split("\\s+");
            if(w.length > 0 && !w[0].isEmpty()) words += w.length;
        }
        System.out.println("Lines: " + lines + ", Words: " + words + ", Chars: " + chars);
    }
}
