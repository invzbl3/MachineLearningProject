package three.chapter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import java.io.File;
import java.io.IOException;

public class JsonHandler {

    /*try {
        JsonFactory jsonFactory =
                new JsonFactory();

        JsonParser parser =
                jsonFactory.createParser(new
                        File("Person.json"));
        // ...
        parser.close();
    } catch (IOException ex) {
        // Handle exceptions
    }

    The nextToken method returns a token.
    However, the JsonParser object keeps track of the current token. In the while loop the
    nextToken method return and advances the
    parser to the next token. The getCurrentName
    method returns the field name for the token.
    The while loop terminates when the last token is
    reached.

    while (parser.nextToken() !=
    JsonToken.END_OBJECT) {
        String token =
    parser.getCurrentName();
    ...
    }

    The body of the loop consists of a series of if
    statements that processes the field by its name.
    Since the address field is an array, another loop
    will extract each of its elements until the ending
    array token is reached.

    if ("firstname".equals(token)) {
        parser.nextToken();
        String fname = parser.getText();
        out.println("firstname : " +
    fname);
    }

    if ("lastname".equals(token)) {
        parser.nextToken();
        String lname = parser.getText();
        out.println("lastname : " +
    lname);
    }
    if ("phone".equals(token)) {
            parser.nextToken();
            long phone =
    parser.getLongValue();
            out.println("phone : " + phone);
    }

    if ("address".equals(token)) {
        out.println("address : ");
        parser.nextToken();
        while (parser.nextToken() !=
    JsonToken.END_ARRAY) {

    out.println(parser.getText());
        }
    }

    The output of this example follows:

    firstname : Smith
    lastname : Peter
    phone : 8475552222
    address :
    100 Main Street
    Corpus
    Oklahoma

    However, JSON objects are frequently more
    complex than the previous example. Here  a
    Persons.json file consists of an array of three
    persons:

    {
        "persons": {
            "groupname": "school",
        "persons":
            [
                {"firstname":"Smith",
                    "lastname":"Peter",
                    "phone":8475552222,
                    "address":["100 Main
         Street", "Corpus", "Oklahoma"] },
                {"firstname":"King",
                    "lastname":"Sarah",
                    "phone":8475551111,
                    "address":["200 Main
         Street", "Corpus", "Oklahoma"] },
                {"firstname":"Frost",
                 "lastname":"Nathan",
                 "phone":8475553333,
                 "address":["300 Main
         Street", "Corpus", "Oklahoma"] }
                ]
            }
         }

         To process this file, we use a similar set of code as
         shown previously. We create the parser and then
         enter a loop as before:

         try {
            JsonFactory jsonfactory = new
            JsonFactory();
                JsonParser parser =
            jsonfactory.createParser(new
            File("Person.json"));
                while (parser.nextToken() !=
                JsonToken.END_OBJECT) {
                    String token =
                parser.getCurrentName();
                    ...
                }
                parser.close();
           } catch (IOException ex) {
           // Handle exceptions
           }

           However, we need to find the persons field and
           then extract each of its elements. The groupname
           field is extracted and diplayed as shown here:

           if ("persons".equals(token)) {
               JsonToken jsonToken =
           parser.nextToken();
                jsonToken = parser.nextToken();
                token = praser.getCurrentName();
                if ("groupname".equals(token)) {
                    parser.nextToken();
                    String groupname =
                    parser.getText();
                        out.println("Group : " +
                        groupname);
                        ...
                        }
                    }

            Next, we find the person field and call a
            parsePerson method to better organize the code:

            parser.nextToken();
            token = parser.getCurrentName();
            if ("person".equals(token)) {
                out.println("Found person");
                parsePerson(parser);
            }

            The parsePerson method follows which is very
            similar to the process used in the first example.
        */
}