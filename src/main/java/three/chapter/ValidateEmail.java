package three.chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.out;

public class ValidateEmail {

    public static void main(String[] args) {
        out.println(validateEmail("myemail@mail.com"));
        out.println(validateEmail("My.Email.123!@mail.net"));
        out.println(validateEmail("myEmail"));

        // The output follows:

        /*
            myemail@mail.com is a valid email address
            My.Email.123!@mail.net is a valid email address
            myEmail is not a valid email address
         */
    }

    public static String validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9.!$'*+/=?^_`{|}~-" +
                "]+@((\\[[0-9]{1,3}\\.[0-9]" +
                "{1,3}\\.[0-9]{1,3}\\." +
                "[0-9]{1,3}\\])|(([a-zAZ\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher =
                pattern.matcher(email);

        if (matcher.matches()) {
            return email + " is a valid email address";
        } else {
            return email + " is not a " +
                    "valid email address";
        }
    }
}