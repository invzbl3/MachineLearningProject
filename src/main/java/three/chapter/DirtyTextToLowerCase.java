package three.chapter;

public class DirtyTextToLowerCase {

    /*dirtyText =
      dirtyText.toLowerCase().trim();
      toFind =
      toFind.toLowerCase().trim();
      int count = 0;

      Next, we call the contains method to determine
      whether the word exists in our text. If it does, we
      split the text into an array and then loop through,
      using the equals method to compare each word.
      If we encounter the word, we increment our
      counter by one. Finally, we display the output to
      show how many times our word was encountered:

      if(dirtyText.contains(toFind)){
        String[] words =
      dirtyText.split(" ");
        for(String word : words) {
            if(word.equals(toFind)) {
                count++;
            }
        }
      out.println("Found " + toFind + " " +
      count + " times in the text.");
      }

      In this example, we set toFind to the letter I. This
      produced the following output:

      Found i 2 times in the text.

      We also have the option to use the Scanner
      class to search through an entire file. One helpful
      method is the findWithinHorizon method.
      This uses a Scanner to parse the text up to a given
      horizon specification. If zero is used for the second
      parameter, as shown next, the entire Scanner will
      be searched by default:

      dirtyText =
      dirtyText.toLowerCase().trim();
      toFind =
      toFind.toLowerCase().trim();
      Scanner textLine = new
      Scanner(dirtyText);
      out.println("Found " +
      textLine.findWithinHorizon(toFind, 10));

      This technique can be more efficient for locating a
      particular string, but it does make it more difficult
      to determine where, and how many times, the
      string was found.

      It can also be more efficient to search an entire file
      using a BufferedReader. We specify the file to
      search and use a try-catch block to catch any IO
      exceptions. We create a new BufferedReader
      object from our path and process our file as long as
      the next line is not empty:

      String path = "C:// MobyDick.txt";
      try {
        String textLine = "";
        toFind =
      toFind.toLowerCase().trim();
      BufferedReader textToClean = new
      BufferedReader(
        new FileReader(path));
        while((textLine =
      textToClean.readLine()) != null) {
        line++;
      if(textLine.toLowerCase().trim().contains(toFind)) {
        out.println("Found " + toFind + " in " + textLine);
            }
      }
      textToClean.close();
      } catch (IOException ex) {
        // Handle exceptions
      }

      We again test our data by searching for the
      word I in the first sentences of Moby Dick. The
      truncated output follows:

      Found i in Call me Ishmael ...
    */
}