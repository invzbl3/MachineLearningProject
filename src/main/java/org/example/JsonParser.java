package org.example;

import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;

public class JsonParser {

    try {
        JsonFactory jsonFactory = new JsonFactory();
        JsonParser parser = jsonFactory.createParser(new File("Person.json"));

        while (parser.nextToken() != JsonToken.END_OBJECT) {
            String token = parser.getCurrentName();

            if ("firstname".equals(token)) {
                parser.nextToken();

                String fname = parser.getText();
                System.out.println("firstname : " + fname);
            }
                // ...
            }
            parser.clone();
        } catch(IOException e) {
            // Handle exceptions
        e.printStackTrace();
    }
}