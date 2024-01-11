package two.chapter;

/**
 * The former class set ups the
 * crawler while the latter contains the logic that
 * controls what pages will be processed.
 *
 * As with our previous crawler, we will crawl the
 * Wikipedia article dealing with Bishop Rock. The
 * results using this crawler will be smaller as many
 * extraneous pages are ignored.
 *
 * Let's look at the CrawlerController class first.
 * There are several parameters that are used with
 * the crawler as detailed here:
 *
 * - Crawl storage folder: The location where crawl data is stored
 * - Number of crawlers: This controls the number
 * of threads used for the crawl
 * - Politeness delay: How many seconds to pause
 * between requests
 * - Crawl depth: How deep the crawl will go
 * - Maximum number of pages to fetch: How
 * many pages to fetch
 * - Binary data: Whether to crawl binary data
 * such as PDF files
 *
 * The basic class is shown here:
 */
/*
public class CrawlerController {

    public static void main(String[] args) throws Exception {
        int numberOfCrawlers = 2;
        CrawlConfig config = new
                CrawlConfig();
        String crawlStorageFolder =
                "data";

        config.setCrawlStorageFolder(crawlStorageFolder);
        config.setPolitenessDelay(500);
        config.setMaxDepthOfCrawling(2);
        config.setMaxPagesToFetch(20);

        config.setIncludeBinaryContentInCrawling(false);
        // ...
    }
}*/
