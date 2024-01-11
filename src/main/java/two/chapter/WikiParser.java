package two.chapter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 * Chapter 2. Data Acquisition
 */
public class WikiParser {
    /**
     * @param args
     *
     * Using the HttpUrlConnection class
     * <p>
     * The contents of a web page can be accesssed using the HttpUrlConnection class.
     * This is a low-level approach that requires the developer to do a lot of footwork
     * to extract relevant content.
     * <p>
     * HttpURLConnection is a derived class which you can use when you need the extra API and
     * you are dealing with HTTP or HTTPS only.
     * HttpsURLConnection is a 'more derived' class which you can use when you need the
     * 'more extra' API and you are dealing with HTTPS only.
     *
     */
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

    /**
     * The connection object is initialized with an
     * HTTP GET command. The connect method is
     * then executed to connect to the server:
     * <p>
     * connection.setRequestMethod("GET");
     * <p>
     * connection.connect();
     * <p>
     * Assuming no errors were encountered, we can
     * determine whether the response was successful
     * using the getResponseCode method. A normal
     * return value is 200. The content of a web page can
     * vary. For example, the getContentType method
     * returns a string describing the page's content. The
     * getContentLength method returns its length:
     * <p>
     * out.println("Response Code: " + connection.getResponseCode());
     * out.println("Content Type: " + connection.getContentType());
     * out.println("Content Length: " + connection.getContentLength());
     */
}