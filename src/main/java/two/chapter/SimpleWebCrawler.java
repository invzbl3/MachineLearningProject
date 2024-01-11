package two.chapter;

import java.util.ArrayList;

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