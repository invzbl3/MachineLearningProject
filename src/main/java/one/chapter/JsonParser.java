package one.chapter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;
import java.io.File;
import java.io.IOException;


/**
 * Chapter 1. Getting Started with Data Science
 */
public class JsonParser {
    public static void main(String[] args) {
        JsonFactory jsonFactory = new JsonFactory();
        com.fasterxml.jackson.core.JsonParser parser;
        try {
            parser = jsonFactory.createParser(new File("Person.json"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        while (true) {
            try {
                if (parser.nextToken() == JsonToken.END_OBJECT) break;
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            String token;
            try {
                token = parser.getCurrentName();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            if ("firstname".equals(token)) {
                try {
                    parser.nextToken();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

                String fname;
                try {
                    fname = parser.getText();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("firstname : " + fname);
            }
            // ...
        }
    }

    /**
     * dirtyText = dirtyText
     *          .toLowerCase()
     *          .replaceAll("[\\d[^\\w\\s]]+", ".trim();
     *
     *          while(dirtyText.contains("   ")) {
     *              dirtyText =
     *          dirtyText .replaceAll(" ", " ");
     *          }
     */

    // Page 60: the code-snippet doesn't work properly because of the issue as: "Illegal self reference

    /*String dirtyText = dirtyText
            .toLowerCase()
            .replaceAll("[\\d[^\\w\\s]]+", "")
            .trim();

    while (dirtyText.contains("   ")) {
        dirtyText = dirtyText.replaceAll(" ", "");
    }*/

    // Page 61: the code-snippet doesn't work properly because of the issue as: "Illegal self reference
    /*String text = text.toLowerCase().trim();
    TokenizerFactory fact = IndoEuropeanTokenizerFactory.INSTANCE;
    fact = new EnglishStopTokenizerFactory(fact);
    Tokenizer tok  = fact.tokenizer(
            text.toCharArray(), 0,
    text.length());
    for(String word : tok) {
        System.out.print(word + " ");
    }*/
}