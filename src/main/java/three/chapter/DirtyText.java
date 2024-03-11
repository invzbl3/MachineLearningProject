package three.chapter;

public class DirtyText {

    /*out.println(dirtyText);
    dirtyText =
    dirtyText.toLowerCase().replaceAll("
    [\\d[^\\w\\s]]+", " ");
    dirtyText = dirtyText.trim();
    while(dirtyText.contains("  ")){
        dirtyText = dirtyText.replaceAll("
    ", " ");
    }
    out.println(dirtyText);

    When executed, the code produces the following
    output, truncated:

    Call me Ishmael. Some years ago-
    never mind how long precisely -
    call me ishmael some years ago never
    mind how long precisely

    Our next example produces the same result but
    approaches the problem with regular expressions.
    In this case, we replace all of the numbers and
    other special characters first. Then we use method
    chaining to standardize our casing, remove leading
    and trailing spaces, and split our words into a
    String array. The split method allows you to
    break apart txt on a given delimiter. In this case,
    we chose to use the regular expression \\W, which
    represents anything that is not a word character:

    out.println(dirtyText);
    dirtyText = dirtyText.replaceAll("[\
    \d[^\\w\\s]]+", "");
    String[] cleanText =
    dirtyText.toLoserCase().trim().split
    ("[\\W]+");
    for(String clean : cleanText) {
        out.print(clean + " ");
    }

    This code produces the same output as shown
    previously.

    Although arrays are useful for many applications,
    it is often important to recombine text after
    cleaning. In the next example, we employ the
    join method to combine our words once we have
    cleaned them. We use the same chained methods
    as shown previously to clean and split our text.
    The join method joins every word in the array
    words and inserts a space between each word:

    out.println(dirtyText);
    String[] words =
    dirtyText.toLowerCase().trim().split
    ("[\\W\\d]+");
    String cleanText = String.join(" ",
    words);
    out.println(cleanText);

    Again, this code produces the same output as
    shown previously. An alternate version of the
    join method is available using Google Guava.
    Here is a simple implementation of the same process
    we used before, but using the Guava
    Joiner class:

    out.println(dirtyText);
    String[] words =
    dirtyText.toLowerCase().trim().split
    ("[\\W\\d]+");
    String cleanText = Joiner.on("
    ").skipNulls().join(words);
    out.println(cleanText);

    This version provides additional options,
    including skipping nulls, as shown before. The
    output remains the same.

    Removing stop words

    Text analysis sometimes requires the omission
    of common, non-specific words such as the, and, or but.

    These words are known as stop words are
    there are several tools available for removing them
    from text. There are various ways to store a list of
    stop words, but for the following examples, we will assume
    they are contained in a file. To begin, we
    create a new Scanner object to read in our stop
    words. Then we make the text we wish to transform
    and store it in an ArrayList using the Arrays
    class's asList method. We will assume here the
    text has already been cleaned and normalized. It is
    essential to consider casing when using String
    class methods - and is not the same as AND or And,
    although all three may be stop words you wish to
    eliminate:

    Scanner readStop = new Scanner(new
    File("C://stopwords.txt"));
    ArrayList<String> words = new
    ArrayList<String>(Arrays.asList((dir
    tyText));
    out.println("Original clean text: " +
    words.toString());

    We also create a new ArrayList to hold a list of
    stop words actually found in our text. This will
    allow us to use the ArrayList class removeAll
    method shortly. Next, we use our Scanner to
    read through our file of stop words. Notice how
    we also call the toLowerCase and trim methods
    against each top word. This is to ensure that our
    stop words match the formatting in our text. In
    this example, we employ the contains method
    to determine whether our text contains the given
    stop word. If so, we add it to our foundWords
    ArrayList. Once we have processed all the stop
    words, we call removeAll to remove them from
    our text:

    ArrayList<String> foundWords = new
    ArrayList();
    while(readStop.hasNextLine()){
    String stopWord =
    readStop.nextLine().toLowerCase();
        if(words.contains(stopWord)) {
            foundWords.add(stopWord);
        }
    }
    words.removeAll(foundWords);
    out.println("Text without stop words:
    " + words.toString());

    The output will depend upon the words designated
    as stop words. If you stop words file contains
    different words than used in this example,
    your output will differ slightly. Our output follows:

    Original clean text: [call, me,
    ishmael, some, years, ago, never,
    mind, how, long, precisely, having,
    little, or, no, money, in, my,
    purse, and, nothing, particular, to,
    interest, me, on, shore, i, thought,
    i, would, sail, about, a, little,
    and, see, the, watery, part, of, the,
    world]
    Text without stop words: [call,
    ishmael, years, ago, never, mind,
    how, long, precisely

    There is also support outside of the standard Java
    libraries for removing stop words. We are going
    to look at one example, using LingPipe. In this
    example, we start by ensuring that our text is
    normalized in lowercase and trimmed. Then we
    create a new instance of the TokenizerFactory
    class. We set our factory to use default English
    stop words and then tokenize the text. Notice that
    the tokenizer method uses a char array, so we
    call toCharArray against our text. The second
    parameter specifies where to begin searching
    within the text, and the last parameter spefcifies
    where to end:
    */
}
