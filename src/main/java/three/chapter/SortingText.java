package three.chapter;

import java.util.*;

import static java.lang.System.out;
public class SortingText {

    public static void main(String[] args) {

        // Create a HashSet to store integers
        List<Integer> numsList = new ArrayList<>();

        numsList.add(12);
        numsList.add(46);
        numsList.add(52);
        numsList.add(34);
        numsList.add(87);
        numsList.add(123);
        numsList.add(14);
        numsList.add(44);
        Comparator<Integer> compareInts =
                (Integer first, Integer second) ->
                        Integer.compare(first, second);

        /*
            We can now call the sort method as we did
            previously:
         */

        Collections.sort(numsList, compareInts);
        out.println("Sorted integers using Lambda: " + numsList.toString());

        /*
            Our output follows:

            Sorted integers using Lambda: [12,
            14, 34, 44, 46, 52, 87, 123]
         */
    }
}