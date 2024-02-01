package two.chapter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/*public class StreamTwitter {

    public static void streamTwitter(
            String consumerKey,
            String consumerSecret,
            String accessToken,
            String accessSecret) throws
            InterruptedException {
        BlockingQueue<String> statusQueue =
                new LinkedBlockingQueue<String>(10000);

        StatusesSampleEndpoint ending =
                new StatusesSampleEndpoint();

        ending.stallWarnings(false);
        //...
    }

    Next, we create an Authentication object using OAuth1,
    a variation of the OAuth class. We can then build our
    connection client and complete the HTTP connection:

    Authentication twitterAuth =
    new OAuth1(consumer,
    Key,

    consumerSecret,
    accessToken,
    accessSecret);
        BasicClient twitterClient =
        new
        ClientBuilder()
        .name("Twitter
        client")
        .hosts(Constants.STREAM_HOST)
        .endpoint(ending)
        .authentication(twitterAuth)
        .processor(new StringDelimited Processor(statusQueue))
        .build();

        twitterClient.connect();

        For the purposes of
        this example, we will simply read the
        messages received from the stream and
        print them to the
        screen. The messages
        and returned in
        JSON format and
        the decision of how to process them in
        a real application will depend upon
        the purpose and limitations of that application:

        for (int msgRead = 0;
        msgRead < 1000;
        msgRead++) {
            if
        (twitterClient.
        isDone()) {

        out.println(twitterClient
        .getExitEvent()
        .getMessage());
            break;
        }

        String msg
        =
        statusQueue.pol
        l(10,
        TimeUnit.SECONDS);
            if (msg == null) {

                out.println("Waited 10 seconds
                - no message received");
                } else {
                out.println(msg);
                }
            }

            twitterClient.stop();

            To execute our method, we simply pass our
            authentication information to the
            streamTwitter method. For security
            purposes, we have replaced our personal keys
            here.
            Authentication information should always be protected:

                public static void main(String[] args) {

                    try {
                        SampleStreamExample.streamTwitter(

                            my Key,
                            mySecret,
                            myToken,
                            myAccess);
                                } catch
                            (InterruptedException e) {
                        out.println(e);
                                }
                            }

            Here is truncated sample data retrieved
            using the methods listed above.
            Your data will vary based upon Twitter's
            live stream, but it should resemble
            this example:

            //...

            Twitter also provides
            support for pulling all data for one
            specific user account,
            as well as posting
            data directly to an account.
            A REST API is also available and provides
            support for specific queries via the search
            API. These also use the OAuth
            standard and return data
            in JSON files.
}*/