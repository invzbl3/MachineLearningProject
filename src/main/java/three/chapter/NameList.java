package three.chapter;

import java.util.Optional;
import static java.lang.System.out;
public class NameList {

    public static void main(String[] args) {
        String useName = "";
        String[] nameList =
                {"Amy", "Bob", "Sally", "Sue", "Don", "Rick",
                        null, "Betsy"};
        Optional<String> tempName;
        for (String name : nameList) {
            tempName =
                    Optional.ofNullable(name);
            useName = tempName.orElse("DEFAULT");
            out.println("Name to use = " + useName);
        }
    }
}