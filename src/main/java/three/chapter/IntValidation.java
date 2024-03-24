package three.chapter;

//import static java.lang.System.out;

public class IntValidation {

    /*public static void main(String[] args) {
        validateInt("1234");
        validateInt("Ishmael");
    }*/

    /*public static void validateInt(String toValidate) {
        try {
            int validInt =
                    Integer.parseInt(toValidate);
            out.println(validInt + " is a valid integer");
        } catch (NumberFormatException e) {
            out.println(toValidate + " is not a valid integer");
        }
    }*/

    /*public static String validateInt(String text) {
        IntegerValidator intValidator =
                IntegerValidator.getInstance();
        if(intValidator.isValid(text)) {
            return text + " is a valid integer";
        } else {
            return text + " is not a valid integer";
        }
    }*/

    /*
        The output follows:
        1234 is a valid integer
        Ishmael is not a valid integer

        The IntegerValidator class also provides
        methods to determine whether an integer is
        greater than or less than a specific value, compare
        the number to a ranger of numbers, and convert
        Number objects to Integer objects. Apache
        Commons has a number of other validator classes.
        We will examine a few more in the rest of this
        section.
     */
}