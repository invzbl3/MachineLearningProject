package two.chapter;

/*
import java.io.IOException;
import java.net.http.HttpRequest;

public class YouTube {

    try {
        YouTube youtube = new
                YouTube.Builder(
                Auth.HTTP_TRANSPORT,
                Auth.JSON_FACTORY,
                new HttpRequestInitializer() {
                    public void
                    initialize(HttpRequest request)
                            throws IOException {
                    }
                })
                .setApplicationName(
                        "application_name")
                ...
    } catch
   (GoogleJSONResponseException ex) {
        // Handle exceptions
    } catch (IOException ex) {
        // Handle exceptions
    }
}


Next, we initialize a string to hold the search term of interest.
In this case, we will look for videos containing the word cats:

String queryTerm = "cats";

The class, YouTube.Search.List, maintains a collection of search
results. The YouTube class's search method specifies the type of
resource to be returned. In this case, the string specifies the id
and snippet portions of the search result to be returned:

YouTube.Search.List search =
                    .youtube
                    .search()
                    .list("id,snippet");

The search result is a JSON object that has the following structure.
It is described in more detail at
https://developers.google.com/youtube/v3/docs/playlistItems#methods.
In the previous sequence, only the id and snippet parts of a search will
be returned, resulting in a more efficient operations:

{
    "kind": "youtube#searchResult",
    "etag": etag,
    "id": {
        "kind": string,
        "videoId": string,
        "channelId": string,
        "playlistId": string
     },
     "snippet": {
        "publishAt": datetime,
        "channelId": string,
        "title": string,
        "description": string,
        "thumbnails": {
            (key): {
                "url": string,
                "width": unsigned integer,
                "height": unsigned integer
            }
        },
        "channelTitle": string,
        "liveBroadcastContent": string
    }
}

Next, we need to specify the API key and various search parameters.
The query term is specified, as well as the type of media to be
returned. In this case, only videos will be returned. The other two
options include channel and playlist:

String apiKey = "Your API key";
    search.setKey(apiKey);
    search.setQ(queryTerm);
    search.setType("video");

In addition, we further specify the fields to be
returned as shown here. These correspond to fields
of the JSON object:

search.setFields("items(id/kind, id/videoId, snippet/title," +
    "snippet/description,snippet/thumbnails/default/url)");

We also specify the maximum number of results to
retrieve using the setMaxResults method:

search.setMaxResults(10L);

The execute method will perform the actual query, returning a
SearchListResponse object. Its getItems method returns a list of
SearchResult objects, one for each video
retrieved:

SearchListResponse searchResponse =
search.execute();
List<SearchResult> searchResultList = searchResponse.getItems();

In this example, we do not iterate through each video returned.
Instead, we retrieve the first video and display information about the video.
The SearchResult video variable allows us to access different parts
of the JSON object, as shown here:

SearchResult video =
searchResultList.iterator().next();
Thumbnail thumbnail = video
.getSnippet().getThumbnails().getDefault();

out.println("Kind: " + video.getKind());
out.println("Video Id: " + video.getId().getVideoId());
out.println("Title: " + video.getSnippet().getTitle());
out.println("Description: " + video.getSnippet().getDescription());
out.println("Thumbnail: " + thumbnail.getUrl());

One possible output follows where parts of the output have
been modified:

Kind: null
Video Id: tnt0...
Title: Funny Cats ...
Description: Check out the ...
Thumbnail: https://i.ytimg.com/vi/tnt0.../default.jpg

We have skipped many error checking steps to simplify the example,
but these should be considered when implementing this in a business
application.

If we need to download the video, one of the simples ways is to use axet/wget
found at https://github.com/axet/wget. It provides an easy-to-use
technique to download the video using video ID.

In the following example, a URL is created using the video ID.
You will need to provide a video ID for this to work properly.
The file is saved to the current directory with the video's title
as the filename:

String url = "http://www.youtube.com/watch?v=videoID";
String path = ".";
VGet vget = new VGet(new URL(url), new File(path));
vget.download();

There are other more sophisticated download techniques
found at the Github site.

Summary

In this chapter, we discussed types of data that are useful for data
science and readily accessible on the Internet. This discussion
included details about file specifications and formats for the most
common types of data sources.

We also examined Java APIs and other techniques for retrieving data,
and illustrated this process with multiple sources. In particular,
we focused on types of text-based document formats and multimedia files.
We used web crawlers to access websites and then performed web scraping to
retrieve data from the sites we encountered.

Finally, we extracted data from social media sites and examined the
available Java support. We
retrieved data from Twitter, Wikipedia, Flickr, and YouTube and
examined the available API support.
*/
