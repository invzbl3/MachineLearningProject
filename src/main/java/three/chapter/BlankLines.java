package three.chapter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;

public class BlankLines {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\text.txt"))) {
            br
                    .lines()
                    .filter(s -> !s.equals(""))
                    // .forEach(out::println)
                    .forEach(s ->
                            out.println(s));
        } catch (IOException ex) {
            // Handle exceptions
        }
    }
}