package three.chapter;

import java.util.StringTokenizer;
import static java.lang.System.out;

public class Tokenizer {
    /*StringTokenizer tokenizer = new
            StringTokenizer(dirtyText, " ");
    while(tokenizer.hasMoreTokens()) {
        out.print(tokenizer.nextToken() + " ");
    }*/
}

/*
    When we set the dirtyText variable to hold our
    text from Moby Dick, shown previously, we get the
    following truncated output:

    Call me Ishmael. Some years ago-
    never mind how long precisely...

    StreamTokenizer is another core Java tokenizer.
    StreamTokenizer grants more information
    about the tokens retrieved, and allows the user to
    specify data types to parse, but is considered more
    difficult to use than StreamTokenizer or the
    split method. The String class split method
    is the simplest way to split strings up based on a
    delimiter, but it does not provide a way to parse
    the split strings and you can only specify one
    delimiter for the entire string. For these reasons, it
    is not a true tokenizer, but it can be useful for data
    cleaning.

    The Scanner class is designed to allow you to
    parse strings into different data types. We used it
    previously in the Handling CSV data section and
    we will address it again in the Removing stop words
    section.

    Third-party tokenizers and libraries

    Apache Commons consists of sets of open
    source Java classes and methods. These provide
    reusable code that complements the standard
    Java APIs. One popular class included in the
    Commons is StrTokenizer. This class provides
    more advanced support than the standard
    StringTokenizer class, specifically more
    control and flexibility. The following is a simple
    implementation of the StrTokenizer:

    StrTokenizer tokenizer = new
    StrTokenizer(text);
    while (tokenizer.hasNext()) {
        out.print(tokenizer.next() + " ");
    }

    This operates in a similar fashion to
    StringTokenizer and by default parses
    tokens on spaces. The constructor can specify the
    delimiter as well as how to handle double quotes
    contained in data.

    When we use the string from Moby Dick, shown
    previously, the first tokenizer implementation
    produces the following truncated output:

    Call me Ishmael. Some years ago-
    never mind how long precisely -
    having little or no money in my
    purse...

    We can modify our constructor as follows:

    StrTokenizer tokenizer = new
    StrTokenizer(text, ",");

    The output for this implementation is:

    Call me Ishmael. Some years ago-
    never mind how long precisely -
    having little or no money in my purse
    and nothing particular to interest me
    on shore
    I thought I would sail about a little
    and see the watery part of the world.

    Notice how each line is split where commas
    existed in the original text. This delimiter can be a
    simple char, as we have shown, or a more complex
    StrMatcher object.
 */