package org.example;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonToken;
import java.io.File;
import java.io.IOException;

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
}