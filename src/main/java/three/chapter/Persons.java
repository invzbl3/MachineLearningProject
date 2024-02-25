package three.chapter;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeType;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import static java.lang.System.out;

public class Persons {

    public void test() {
        try {
            ObjectMapper mapper =
                    new ObjectMapper();
            JsonNode node =
                    mapper.readTree(new
                            File("Persons.json"));
            Iterator<String> fieldNames =
                    node.fieldNames();
            while (fieldNames.hasNext()) {
                // ...
                fieldNames.next();
            }
        } catch (IOException ex) {
            // Handle exceptions
        }
    }

    /*
        Since the JSON file contains a persons field, we
        will obtain a JsonNode instance representing the
        field and then iterate over each of its elements.
     */

    /*JsonNode personsNode =
            node.get("persons");
    Iterator<JsonNode> elements =
            personsNode.iterator();

    while (elements.hasNext()) {
        // ...
    }*/

    /*
        Each element is processed one at a time. If the
        element type is a string, we assume that this is the
        groupname field.
     */

    /*JsonNode element = elements.next();
    JsonNodeType nodeType =
            element.getNodeType();

    if (nodeType == JsonNodeType.STRING) {
        out.println("Group: " +
                element.textValue());
    }*/

    /*
        If the element is an array, we assume it contains a
        series of persons where each person is processed by
        the parsePerson method:

        if (nodeType == JsonNodeType.ARRAY) {
            Iterator<JsonNode> fields =
            element.iterator();
                while (fields.hasNext()) {
                    parsePerson(fields.next());
                }
            }

         The parsePerson method is shown next:
         public void parsePerson(JsonNode node) {
            Iterator<JsonNode> fields =
            node.iterator();
                while(fields.hasNext()) {
                    JsonNode subNode =
                fields.next();

                out.println(subNode.asText());
                }
           }

           The output follows:
           Group: school
           Smith
           Peter
           8475552222
           King
           Sarah
           8475551111
           Frost
           Nathan
           8475553333

           There is much more to JSON than we are able to
           illustrate here. However, this should give you an
           idea of how this type of data can be handled.
     */
}