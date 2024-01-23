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

*/