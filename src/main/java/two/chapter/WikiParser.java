package two.chapter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class WikiParser {

    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "https://en.wikipedia.org/wiki/Data_science");
            HttpsURLConnection connection
                    = (HttpsURLConnection)
                    url.openConnection();
            //...
        } catch (MalformedURLException ex) {
            // Handle exceptions
        } catch (IOException ex) {
            // Handle exceptions
        }
    }
}