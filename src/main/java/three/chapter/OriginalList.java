package three.chapter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import static java.lang.System.out;
import static java.util.stream.Collectors.toCollection;

public class OriginalList {
    public static void main(String[] args) {
        // Create a HashSet to store integers
        Set<Integer> numsList = new HashSet<>();

        // Add elements to the set
        /*numsList.add(12);
        numsList.add(46);
        numsList.add(52);
        numsList.add(34);
        numsList.add(87);
        numsList.add(123);
        numsList.add(14);
        numsList.add(44);*/

        numsList.add(12);
        numsList.add(46);
        numsList.add(52);
        numsList.add(34);
        numsList.add(87);
        numsList.add(123);
        numsList.add(14);
        numsList.add(44);

        out.println("Original List: " +
                numsList.toString());

        Set<Integer> fullNumsList = new
                TreeSet<Integer>(numsList);
        Set<Integer> partNumsList =
                fullNumsList
                        .stream()
                        .skip(5)
                        .collect(toCollection(TreeSet::new));
        out.println("SubSet of List:  " +
                partNumsList.toString());
    }
}