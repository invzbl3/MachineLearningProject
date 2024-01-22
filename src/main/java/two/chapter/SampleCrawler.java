package two.chapter;

import sun.jvm.hotspot.debugger.Page;
import java.util.regex.Pattern;

/*
public class SampleCrawler extends WebCrawler {

    */
/*private static final Pattern IMAGE_EXTENSION =
            Pattern.compile(".*\\.(bmp|gif|jpg|png)$");*//*

    // ...

    */
/*public boolean shouldVisit(Page referringPage, WebURL url) {
        String href =
        url.getURL().toLowerCase();

        if(IMAGE_EXTENSION.matcher(href).matches()) {
            return false;
        }
        return href.startsWith("https://en.wikipedia.org/wiki");
    }*//*

/*
    public void visit(Page page) {
        String url =
        page.getWebURL().getURL();
            if (page.getParseData() instanceof HtmlParseData) {
                HtmlParseData
                htmlParseData =

                (HtmlParseData)
                page.getParseData();

                String text =
                htmlParseData.getText();

                if (text.contains("shipping route")) {

                    out.println("\n URL: " + url);
                    out.println("Text: " + text);
                    out.println("Text length: " +
                        text.length());
                        }
                    }
                }

    The following is the truncated output of the program
    when executed:

    URL: https://en.wikipedia.org/wiki/Bishop_Rock,
    _Isles_of_Scilly
    Text: Bishop Rock, Isles of
    Scilly...From
    Wikipedia, the
    free
    encyclopedia ...
    Jump to: ...
    navigation,
    search For the Bishop Rock in
    the Pacific Ocean, see Cortes Bank.
    Bishop Rock
    Bishop Rock
    Lighthouse
    (2005)
    ...
    Text length:
    14677
}*/