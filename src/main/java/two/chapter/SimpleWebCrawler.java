package two.chapter;

import java.util.ArrayList;

/**
 * The instance variables are detailed here:
 *
 * Variable:
 * topic
 *
 * Use
 * The keyword that needs to
 * be in a page for the page to
 * be accepted
 *
 * startingURL
 *
 * Use
 * The URL of the first page
 *
 * urlLimiter
 *
 * Use
 * A string that must be
 * contained in a link before it
 * will be followed
 *
 * pageLimit
 *
 * Use
 * The maximum number of
 * pages to retrieve
 *
 * visitedList
 *
 * Use
 * The ArrayList containing
 * pages that have already been
 * visited
 *
 * pageList
 *
 * Use
 * An ArrayList containing
 * the URLs of the pages of
 * interest
 */
public class SimpleWebCrawler {

    private String topic;
    private String startingURL;
    private String urlLimiter;
    private final int pageLimit = 20;
    private ArrayList<String>
            visidedList = new ArrayList<>();
    private ArrayList<String>
            pageList = new ArrayList<>();
    // ...
    public static void main(String[] args) {
        new SimpleWebCrawler();
    }
}