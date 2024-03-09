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
    */
}
