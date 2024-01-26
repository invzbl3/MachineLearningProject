package two.chapter;

import java.io.IOException;

/*
public class DataScience {

    try {
        Document document =
                Jsoup.connect(
                        "https://
                        en.wikipedia.org/wiki/
                        Data_science").get();

        // ...
    } catch(IOException ex) {
        // Handle exception
    }
}

try {
    File file = new
    File("Example.html");
    Document document =
    Jsoup.parse(file, "UTF-8", "");
            ...
     } catch (IOException ex) {
        // Handle exception
     }

    The Example.html file follows:

    <html>
    <head>><title>Example Document</
    title></head
    <body>
    <p>The body of the document</p>
    Interesting Links:
    <br>
    <a href="https://en.wikipedia.org/
    wiki/Data_science">Data Science</a>
    <br>
    <a href="https://en.wikipedia.org/
    wiki/Jsoup">Jsoup</a>
    <br>
    Images:
    <br>
     <img src="eyechart.jpg" alt="Eye Chart">
     </body>
     </html>


     To create a Document object from a string, we
     will use the following sequence where the parse
     method processes the string that duplicates the
     previous HTML file:

     String html = "<html>\n"
        + "<head><title>Example
        Document</title></head>\n"
            + <body>\n"
            + <p>The body of the
        document</p>\n"
            + "Interesting Links:\n"
            + <br>\n"
            + "<a href="https://
            en.wikipedia.org/wiki/
            Data_science">" +
                "DataScience</a>\n"
            + "<br>\n"
            + <a href="https://
            en.wikipedia.org/wiki/Jsoup">" +
              "Jsoup</a>\n"
            + "<br>\n"
            + "Images:\n"
            + "<br>\n"
            + " <img src="eyechart.jpg"
            alt="Eye Chart"> \n"
            + "</body>\n"
            + "</html>";

            Document document =
        Jsoup.parse(html);

        The Document class possesses a number of useful
        methods. The title method returns the title.
        To get the text contents of the document, the
        select method is used. This method uses a string
        specifying the element of a document to retrieve:

        String title = document.title();
            out.println("Title: " + title);
            Elements element =
        document.select("body");
            out.println(" Text: " +
        element.text());

        The output for the Wikipedia data science page
        is shown here. It has been shortened to conserve
        space:

        Title: Data science - Wikipedia, the
        free encyclopedia
        Text: Data science From Wikipedia,
        the free encyclopedia Jump to:
        navigation, search Not to be confused
        with information science. Part of a
        ...
        policy About Wikipedia Disclaimers
        Contact Wikipedia Developers Cookie
        statement Mobile view

        -----------------------------------
        The parameter type of the select method is a
        string. By using a string, the type of information
        selected is easily changed. Details on how to
        formulate this string are found at the jsoup
        Javadocs for the Selector class at https://
        jsoup.org/apidocs/:

        We can use the select method to retrieve the
        images in a document, as shown here:

        Elements images =
        document.select("img[src$=.png]");
            for (Element image : images) {
                out.println("\nImage: " +
            image);
        }

        The output for the Wikipedia data science page
        is shown here. It has been shortened to conserve
        space:

        Image: <img alt="Data Visualization"
        src="//upload.wikimedia.org/...>
        Image: <img alt="" src="//
        upload.wikimedia.org/wikipedia/
        commons/thumb/b/ba/...>

        Links can be easily retrieved as shown next:

        Elements links =
        document.select("a[href]");
            for (Element link : links) {
                out.println("Link: " +
        link.attr("href")
            + " Text: " +
        link.text());

        The output for the Example.html page is shown
        here:

        Link: https://en.wikipedia.org/wiki/
        Data_science Text: Data Science
        Link: https://en.wikipedia.org/wiki/
        Jsoup Text: Jsoup

        jsoup possesses many additional capabilities.
        However, this example demonstrates the
        web scraping process. There are also other
        Java HTML parsers available. A comparison
        of Java HTML parser, among others, can be
        found at https://en.wikipedia.org/wiki/
        Comparison_of_HTML_parsers.
*/