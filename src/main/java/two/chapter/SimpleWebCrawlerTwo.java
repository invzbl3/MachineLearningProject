package two.chapter;

/*public class SimpleWebCrawlerTwo {

    startingURL = https://
    en.wikipedia.org/wiki/Bishop_Rock, "
        + "Isles_of_Scilly";
    urlLimiter = "Bishop_of_Scilly";
    topic = "shipping route";

    visitPage(startingURL);
}

    public void visitPage(String url) {
        if (pageList.size() >=
            pageLimit) {
                return;
        }
        ...
    }

    // If the page has already been visited, then we ignore
    it. Otherwise, it is added to the visited list:

    if (visitedList.contains(url)) {
        // URL already visited
        } else {
            visitedList.add(url);
                ...
        }


   try {
        Document doc =
   Jsoup.connect(url).get();
                ...
         } catch (Exception ex) {
            // Handle exceptions
         }

    if (doc.text().contains(topic)) {
        out.println((pageList.size()
    + 1) + ": [" + url + "]");

    pageList.add(url);

    // Process page links
    Elements questions =
  doc.select("a[href]");
    for (Element link : questions)
  {
  if (link.attr("href").contains(urlLimiter) {
    visitPage(link.attr("abs:href"));
                }
          }
    }

    The output follows:

    1: [https://en.wikipedia.org/wiki/Bishop_Rock, _Isles_of_Scilly]
    2: [https://en.wikipedia.org/wiki/Bishop_Rock_Lighthouse]
    3. [https://en.wikipedia.org/w/index.php?
    title=Bishop_Rock,_Isles_of_Scilly&oldid=717634231#Lighthouse]
    4: [https://en.wikipedia.org/w/index.php?
    title=Bishop_Rock,_Isles_of_Scilly&diff=prev&oldid=717634231]
    5: [https://en.wikipedia.org/w/index.php?
    title=Bishop_Rock,_Isles_of_Scilly&oldid=716622943]
    6: [https://en.wikipedia.org/w/index.php?
    title=Bishop_Rock,_Isles_of_Scilly&d
    iff=prev&oldid=716622943]
    7: [https://en.wikipedia.org/w/
    index.php?
    title=Bishop_Rock,_Isles_of_Scilly&o
    ldid=716608512]
    8: [https://en.wikipedia.org/w/index.php?
    title=Bishop_Rock,_Isles_of_Scilly&d
    iff=prev&oldid=716608512]
    ...
    20: [https://en.wikipedia.org/w/index.php?
    title=Bishop_Rock,_Isles_of_Scilly&d
    iff=prev&oldid=716603919]
*/