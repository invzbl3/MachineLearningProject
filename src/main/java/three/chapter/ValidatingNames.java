package three.chapter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import static java.lang.System.out;

/**
 * Validating names
 *
 * Names can be especially tricky to validate because
 * there are so many variations. There are no industry
 * standards or technical limitations, other than
 * what characters are available on the keyboard.
 * For this example, we have chosen to use Unicode
 * in our regular expression because it allows us
 * to match any character from any language. The
 * Unicode property \\p{L} provides this flexibility.
 */
public class ValidatingNames {

    /**
     * We also use \\s-', to allow spaces,
     * apostrophes, commas, and hyphens in our name fields.
     * It is possible to perform string cleaning,
     * as discussed earlier in this chapter,
     * before attempting to match names.
     * This will simplify the regular expression required:
      */
    public static void validateName(String name) {
        String nameRegex = "^[\\p{L}\\s-',]+$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()) {
            out.println(name + " is a valid name");
        } else {
            out.println(name + " is not a valid name");
        }
    }

    /**
     * We make the following method calls to test our
     * data:
     */
    public static void main(String[] args) {
        validateName("Bobby Smith, Jr.");
        validateName("Bobby Smith the 4th");
        validateName("Albrecht Müller");
        validateName("Francois Moreau");

        /**
         * The output follows:
         *
         * Bobby Smith, Jr. is not a valid name
         * Bobby Smith the 4th is not a valid name
         * Albrecht Müller is a valid name
         * Francois Moreau is a valid name
         *
         * Notice that the comma and period in Bobby
         * Smith, Jr. are acceptable, but the 4 in 4th is
         * not. Additionally, the special characters in
         * Francois and Müller are considered valid.
         */
    }
}
