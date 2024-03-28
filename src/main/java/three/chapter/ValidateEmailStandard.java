package three.chapter;

/*import static java.lang.System.out;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;*/
/*
public class ValidateEmailStandard {

    public static void main(String[] args) {
        out.println(validateEmailStandard("myEmail@mail"));
    }

    public static String validateEmailStandard(String email) {

        try {
            InternetAddress testEmail =
                    new InternetAddress(email);

            testEmail.validate();
            return email + " is a valid email address";
        } catch (AddressException e) {
            return email + " is not a valid email address";
        }
    }
}*/