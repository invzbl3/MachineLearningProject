package three.chapter;

import static java.lang.System.out;
public class SimpleSplitter {

    /*Splitter simpleSplit =
    Splitter.on(',').omitEmptyStrings().
    trimResults();
    Iterable<String> words =
    simpleSplit.split(dirtyText);
    for(String token: words){
        out.print(token);
    }

    This splits each token on commas and produces
    output like our last example. We can modify
    the parameter of the on method to split on the
    character of our choosing. Notice the method
    chaining which allows us to omit empty strings
    and trim leading and trailing spaces. For these
    reasons, and other advanced capabilities, Google
    Guava is considered by some to be the best
    tokenizer available for Java.

    LingPipe is a linguistical toolkit available for
    language processing in Java. It provides more
    specialized support for text splitting with its
    TokenizerFactory interface. We implement a
    LingPipe IndoEuropeanTokenizerFactory
    tokenizer in the Simple text cleaning section.*/
}