package three.chapter;

import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import static java.lang.System.out;

public class ParsePerson {

    /*public void parsePerson(JsonParser parser)
            throws IOException {
        while (parser.nextToken() != JsonToken.END_ARRAY) {
            String token =
                    parser.getCurrentName();
            if ("firstname".equals(token)) {
                parser.nextToken();
                String fname = parser.getText();
                out.println("firstname : " + fname);
            }
            if ("lastname".equals(token)) {
                parser.nextToken();
                String lname = parser.getText();
                out.println("lastname :" + lname);
            }
            if ("phone".equals(token)) {
                parser.nextToken();
                long phone = parser.getLongValue();
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
        }
    }*/

    /*
        The output follows:

        Group : school
        Found person
        firstname : Smith
        lastname : Peter
        phone : 8475552222
        address :
        100 Main Street
        Corpus
        Oklahoma
        firstname : King
        lastname : Sarah
        phone : 8475551111
        address :
        200 Main Street
        Corpus
        Oklahoma
        firstname : Frost
        lastname : Nathan
        phone : 8475553333address :
        300 Main Street
        Corpus
        Oklahoma
     */
}