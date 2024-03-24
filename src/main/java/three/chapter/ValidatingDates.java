package three.chapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.lang.System.out;

public class ValidatingDates {

    public static void main(String[] args) {
        String dateFormat = "MM/dd/yyyy";
        out.println(validateDate("12/12/1982", dateFormat));
        out.println(validateDate("12/12/82", dateFormat));
        out.println(validateDate("Ishmael", dateFormat));

        // The output follows:

        /*
            12/12/1982 is a valid date
            12/12/82 is not a valid date
            Ishmael is not a valid date

            This example highlights why it is important to
            consider the restrictions you place on data. Our
            second method call did contain a legitimate date,
            but it was not in the format we specified. This
            is good if we are looking for very specifically
            formatted data. But we also run the risk of leaving
            out useful data if we are too restrictive in our
            validation.
         */
    }

    public static String validateDate(String theDate,
                                      String dateFormat) {
        try {
            SimpleDateFormat format =
                    new SimpleDateFormat(dateFormat);
            Date test =
                    format.parse(theDate);

            if(format.format(test).equals(theDate)) {
                return theDate.toString() + " is a valid date";
            } else {
                return theDate.toString() + " is not a valid date";
            }
        } catch(ParseException e) {
            return theDate.toString() + " is not a valid date";
        }
    }
}