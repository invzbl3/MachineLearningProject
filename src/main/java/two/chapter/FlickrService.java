package two.chapter;

public class FlickrService {

    /*try {
        String apikey = "Your API key";
        String secret = "Your secret";

    } catch (FlickrException | IOException ex) {
        // Handle exceptions
    }

    The Flickr instance is created next, where
    the apikey and secret are supplied as the first
    two parameters. The last parameter specifies the
    transfer technique used to access Flickr servers.
    Currently, the REST transport is supported using
    the REST class:

    Flickr flickr = new Flickr(apikey,
    secret, new REST());

    To search for images, we will use the
    SearchParameters class. This class supports
    a number of criteria that will narrow down the
    number of images returned from a query and
    includes such criteria as latitude, longitude, media
    type, and user ID. In the following sequence, the
    setBBox method specifies the longitude and
    latitude for the search. The parameters are (in
    order): minimum longitude, minimum latitude,
    maximum longitude, and maximum latitude. The
    setMedia method specifies the type of media.
    There are three possible arguments - "all",
    "photos", and "videos":

        SearchParameters searchParameters =
        new SearchParameters();
            searchParameters.setBBox("-180",
        "-90", "180", "90");

        searchParameters.setMedia("photos");

        The PhotosInterface class possesses a search
        method that uses the SearchParameters
        instance to retrieve a list of photos. The
        getPhotosInterface method returns an
        instance of the PhotosInterface class, as
        shown next. The SearchParameters instance
        is the first parameter. The second parameter
        determines how many photos are retrieved per
        page and the third parameter is the offset. A
        PhotoList class instance is returned:

        PhotosInterface pi = new
        PhotosInterface(apikey, secret,
                new REST());
            PhotoList<Photo> list =
            pi.search(searchParameters, 10, 0);

        The next sequence illustrates the use of several
        methods to get information about the images
        retrieved. Each Photo instance is accessed using
        the get method. The title, image format, public
        flag, and photo URL are displayed:

        out.println("Image List");
        for (int i = 0; i < list.size();
        i++) {
            Photo photo = list.get(i);
            out.println("Image: " + i +
                "\nTitle: " +
            photo.getTitle() +
                "\nMedia: " +
            photo.getOriginalFormat() +
                "\nPublic: " +
            photo.isPublicFlag() +
                "\nUrl: " + photo.getUrl()
            +
                "\n");
        }
        out.println();

        A partial listing is shown here where many of the
        specific  values have been modified to protect the
        original data:

        Image List
        Image: 0
        Title: XYZ Image
        Media: jpg
        Public: true
        URl: https://flickr.com/
        photos/7723...@NO2/269...
        Image: 1
        Title: IMG_5555.jp
        Media: jpg
        Public: true
        Url: https://flickr.com/
        photos/2665...@NO7/264...
        Image: 2
        Title: DSC05555
        Media: jpg
        Public: true
        Url: https://flickr.com/
        photos/1179...@N04/264...
    */
}
