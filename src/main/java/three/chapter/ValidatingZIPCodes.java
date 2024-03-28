package three.chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.out;

/**
 * Postal codes are generally formatted specific
 * to their country or local requirements. For this
 * reason, regular expressions are useful because
 * they can accommodate any postal code required.
 * The example that follows demonstrates how to
 * validate a standard United States postal code, with
 * or without the hyphen and last four digits:
 */
public class ValidatingZIPCodes {

    public static void validateZip(String zip) {

        String zipRegex = "^[0-9]{5}(?:-[0-9]{4})?$";
        Pattern pattern =
                Pattern.compile(zipRegex);
        Matcher matcher = pattern.matcher(zip);

        if(matcher.matches()) {
            out.println(zip + " is a valid zip code");
        } else {
            out.println(zip + "is not a valid zip code");
        }
    }

    /**
     * We make the following method calls to test our data:
     */
    /*public static void main(String[] args) {
        out.println(validateZip("12345"));
        out.println(validateZip("12345-6789"));
        out.println(validateZip("123"));
    }*/

    /**
        The output follows:
        12345 is a valid zip code
        12345-6789 is a valid zip code
        123 is not a valid zip code
     */
}