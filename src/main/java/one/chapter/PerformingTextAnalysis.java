package one.chapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PerformingTextAnalysis {

    public static void main(String[] args) {

        try (InputStream input = new
                FileInputStream(
                    new File("en-pos-maxent.bin"));) {

            String sentence = "Let's parse this sentence.";
            // ...
            String[] words;
            // ...
            list.toArray(words);
            POSModel posModel = new POSModel(input);
            // ...
        } catch (IOException ex) {
            // Handle exceptions
        }
    }
}