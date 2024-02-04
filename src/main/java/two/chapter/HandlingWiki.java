package two.chapter;

/*public class HandlingWiki {

    User user = new User("", "",
        "http://en.wikipedia.org/w/
   api.php"
         user.login();

    // An account will enable us to modify the document.
    // The queryContent method returns a list of Page
    // objects for the subjects found in a string array.

    // Each string should be the title of a page.
    String[] titles = {"Data science"};
        List<Page> page List =
   user.queryContent(titles);

   // Each Page object contains the content of a page.
   // There are several methods that will return the
   // contents of the page. For each page, a WikiModel
   // instance is crated using the two-argument
   // constructor.

   // 1#. The first argument is the image base URL;
   // #2. The second argument is the link base URL.
   These URLs use Wiki variables called image and title.

   for (Page page : pageList) {
        WikiModel wikiModel = new
  WikiModel("${image}",
                "${image}",
                   "${title}");
        ...
    }

    The render method will take the wiki page and
    render it to HTML. There is also a method a render
    the page to a PDF document:

    String htmlText =
   wikiModel.render(page.toString());

   The HTML text is then displayed:
    out.println(htmlText);

   A partial of the output follows:

   <p>PageID: 35458904; NS: 0; Title:
   Data science:
   Image url:
    Content:
    {{distinguish}}
    {{Use dmy dates}}
    {{Data Visualization}}</p>
    <p><b> Data science</b> is an
    interdisciplinary field about
    processes and systems to extract <a
    href="Knowledge" >knowledge</a>
    ...

    We can also obtain basic information about the
    article using one of several methods as shown here:

        out.println("Title: " +
    page.getTitle() + "\n" +
            "Page ID: " + page.getPageid()
    + "\n" +
            "Timestamp: " +
    page.getCurrentRevision().getTimestamp());

    It is also possible to obtain a list of references in the
    article and a list of the headers. Here, a list of the
    references is displayed:

        List <Reference> referenceList =
    wikiModel.getReferences();

    out.println(referenceList.size());
        for(Reference reference :
    referenceList) {
    out.println(reference.getRefString()
    );
        }

    The following illustrates the process of getting the
    section headers:

        ITableOfContent toc =
    wikiModel.getTableOfContent();
          List<SectionHeader> sections =
    toc.getSectionHeaders();
        for(SectionHeader sh : sections)
    {
            out.println(sh.getFirst();
        }

    The entire content of Wikipedia can be downloaded.
    This process is discussed at https://en.wikipedia.org/wiki/
    Wikipedia:Database_download.

    It may be desirable to set up your own Wikipedia
    server to handle your request.
}*/