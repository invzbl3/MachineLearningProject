package one.chapter;

import java.io.*;
import java.nio.file.Files;

public class PerformingTextAnalysis {

    public static void main(String[] args) {

        try (InputStream input = Files.newInputStream(
                new File("en-pos-maxent.bin").toPath())) {

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