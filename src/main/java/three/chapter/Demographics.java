package three.chapter;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Demographics {

    /*try (Scanner csvData = new Scanner(
            new File("Demographics.csv"))) {
        ArrayList<String> list = new
                ArrayList<String>();
        while(csvData.hasNext()) {
            list.add(csvData.nextLine());
        } catch (FileNotFoundException ex) {
            // Handle exceptions
        }
    }*/

    /*
        The list is converted to an array using the
        toArray method. This version of the method uses
        a String array as an argument so that the method
        will know what type of array to create. A two-
        dimension array is then created to hold the CSV
        data.
     */

    /*String[] tempArray = list.toArray(new String[1]);
    String[][] csvArray = new
            String[tempArray.length][];*/

    /*
        The split method is used to create an
        array of Strings for each row. This array
        is assigned to a row
        of the csvArray.
     */

    /*
        for (int i = 0; i<tempArray.length; i++) {
            csvArray[i] = tempArray[i].split(",");
        }
     */

    /*
        Our next technique will use a third-party library to read in and
        process CSV data. There are multiple options available, but
        we will focus on the popular OpenCSV (http://opencsv.sourceforge.net).
        This library offers several advantages over our previous technique.
        We can have an arbitrary number of items on each row
        without worrying about handling exceptions.
        We also do not need to worry about embedded commas or embedded carriage
        returns within the data tokens. The library also
        allows us to choose between reading the entire file
        at once or using an iterator to process
        data line-by-line.

        First, we need to create an instance of the
        CSVReader class. Notice the second parameter
        allows us to specify the delimiter, a useful feature
        if we have similar file format delimited by tabs or
        dashes, for example. If we want to read the entire
        file at one time, we use the readAll method.
     */

    /*
        CSVReader dataReader =
        new CSVReader(new
        FileReader("Demographics.csv"),',');
        ArrayList<String> holdData =
        (ArrayList)dataReader.readAll();
     */

    /*
        We can then process the data as we did above,
        by splitting the data into a two-dimension array
        using String class methods. Alternatively, we
        can process the data one line at a time. In the
        example that follows, each token is printed out
        individually but the tokens can also be stored in
        a two-dimension array or other data structure as
        appropriate.
     */

    /*
        CSVReader dataReader =
        new CSVReader(new
        FileReader("Demographics.csv"),',');
        String[] nextLine;
        while ((nextLine =
        dataReader.readNext()) != null) {
        for(String token : nextLine) {
            out.println(token);
           }
        }
        dataReader.close();

        We can now clean or otherwise process the array.
     */
}