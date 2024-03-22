/*
package three.chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import static java.lang.System.out;

public class SubsettingData {

    Integer[] nums = {12, 46, 52, 34, 87,
    123, 14, 44};

    TreeSet<Integer> fullNumsList = new
    TreeSet<Integer>(new
    ArrayList<>(Arrays.asList(nums)));
    SortedSet<Integer> partNumsList;
    out.println("Original List: " +
    fullNumsList.toString()
        + " " + fullNumsList.last());

    partNumsList =
    fullNumsList.subSet(fullNumsList.first(), 46);
    out.println("SubSet of List: " +
    partNumsList.toString()
            + " " + partNumsList.size());
}*/

/*
    Our output follows:

    Original List: [12, 14, 34, 44, 46,
    52, 87, 123]
    SubSet of List: [12, 14, 34, 44]
 */