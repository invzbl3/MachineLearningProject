package three.chapter;

public class FindingNReplacingText {

    /*
        text = text.toLowerCase().trim();
        toFind =
        toFind.toLowerCase().trim();
        out.println(text);

        if(text.contains(toFind)) {
            text = text.replaceAll(toFind,
        replaceWith);
            out.println(text);
        }

        To test this code, we set toFind to the word I and
        replaceWith to Ishmael. Our output follows:

        call me ishmael. some years ago-
        never mind how long precisely -
        having little or no money in my
        purse, and nothing particular to
        interest me on shore, i thought i
        would sail about a little and see the
        watery part of the world.
        call me ishmael. some years ago-
        never mind how long precisely -
        having little or no money in my
        purse, and nothing particular to
        interest me on shore, Ishmael thought
        Ishmael would sail about a little and
        see the watery part of the world.

        Apache Commons also provides a replace
        method with several variations in the
        StringUtils class. This class provides much of
        the same functionality as the String class, but
        with more flexibility and options. In the following
        example, we use our string from Moby Dick and
        replace all instances of the word me with X to
        demonstrate the replace method:

        out.println(text);
        out.println(StringUtils.replace(text
        , "me", "X"));

        The truncated output follows:

        Call me Ishmael. Some years ago-
        never mond how long precisely -
        Call X Ishmael. SoX years ago- never
        mind how long precisely -

        Notice how every instance of me has been replaced,
        even those instances contained within other
        words, such as some. This can be avoided by
        adding spaces around me, although this will
        ignore any instances where me is at the end of
        the sentence, like me. We will examine a better
        alternative using Google Guava in a moment.

        The StringUtils class also provides a
        replacePattern method that allows you to
        search for and replace text based upon a regular
        expression. In the following example, we replace
        all non-word characters, such as hyphens and
        commas, with a single space:

        out.println(text);
        text =
        StringUtils.replacePattern(text, "\
        \W\\s", " ");
        out.println(text);

        This will produce the following truncated output:

        Call me Ishmael. Some years ago-
        never mind how long precisely -
        Call me Ishmael Some years ago never
        mind how long precisely

        Google Guava provides additional support
        for matching and modify text data using the
        CharMatcher class. CharMatcher not only
        allows you to find data matching a particular
        char pattern, but also provides options as to
        how to handle the data. This includes allowing
        you to retain the data, replace the data, and trim
        whitespaces from within a particular string.

        In this example, we are going to use the replace
        method to simply replace all instances of the
        word me with a single space. This will produce
        series of empty spaces within our text. We will
        then collapse the extra whitespace using the
        trimAndCollapseFrom method and print our
        string again:

        text = text.replace("me", " ");
        out.println("With double spaces: " +
        text);
        String spaced =
        CharMatcher.WHITESPACE.trimAndCollap
        seFrom(text, ' ');

        out.println("With double spaces
        removed: " + spaces);

        Our output is truncated as follows:

        With double spaces: Call Ishmael. So
        years ago- ...
        With double spaces removed: Call
        Ishmael. So years ago- ...
     */
}