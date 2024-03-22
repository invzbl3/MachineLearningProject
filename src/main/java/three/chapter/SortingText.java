package three.chapter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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

            We then mimic the process with our wordsList.
            Notice the use of the compareTo method rather
            than compare:
         */

        /*Comparator<String> compareWords =
                (String first, String second) ->
                        first.compareTo(second);
        Collections.sort(wordsList, compareWords);
        out.println("Sorted words using Lambda: " + wordsList.toString());*/

        /*
            When this code is executed, we should see the
            following output:

            Sorted words using Lambda: [boat,
            cat, dog, house, road, zoo]

            In our next example, we are going to use
            the Collections class to perform basic
            sorting on String and integer data. For this
            example, wordList and numsList are both
            ArrayList and are initialized as follows:
         */

        /*List<String> wordsList
                = Stream.of("cat", "dog",
                "house", "boat", "road", "zoo")
                .collect(Collectors.toList());

        List<Integer> numsList =
                Stream.of(12, 46, 52, 34, 87, 123,
                        14, 44)
                        .collect(Collectors.toList());*/

        /*
            First, we will print our original version of each list
            followed by a call to the sort method. We then
            display our data, sorted in ascending fashion:

            out.println("Original Word List: " +
            wordsList.toString());
            Collections.sort(wordsList);
            out.println("Ascending Word List: " +
            wordsList.toString());
            out.println("Original Integer List: "
            + numsList.toString());
            Collections.sort(numsList);
            out.println("Ascending Integer List:
            " + numsList.toString());

            The output follows:

            Original Word List: [cat, dog, house,
            boat, road, zoo]
            Ascending Word List: [boat, cat, dog,
            house, road, zoo]
            Original Integer List: [12, 46, 52,
            34, 87, 123, 14, 44]
            Ascending Integer List: [12, 14, 34,
            44, 46, 52, 87, 123]

            Next, we will replace the sort method with the
            reverse method of the Collections class in
            our integer data example. This method simply
            takes the elements and stores them in reverse
            order:

            out.println("Original Integer List: " +
            numsList.toString());
            Collections.reverse(numsList);
            our.println("Reversed Integer List:
            " + numsList.toString());

            The output displays our new numsList:

            Original Integer List: [12, 46, 52,
            34, 87, 123, 14, 44]
            Reversed Integer List: [44, 14, 123,
            87, 34, 52, 46, 12]

            In our next example, we handle the sort using
            the Comparator interface. We will continue to
            use our numsList and assume that no sorting
            has occurred yet. First we create two objects that
            implement the Comparator interface. The sort
            method will use these objects to determine the
            desired order when comparing two elements.
            The expression Integer::compare is a Java
            8 method reference. This is can be used where a
            lambda expression is used:

            out.println("Original Integer List: "
            + numsList.toString());
            Comparator<Integer> basicOrder =
            Integer::compare;
            Comparator<Integer> descendOrder =
            basicOrder.reversed();
            Collections.sort(numsList, descendOrder);
            out.println("Descending Integer List;
            " + numsList.toString());

            After we execute this code, we will see the
            following output:

            Original Integer List: [12, 46, 52,
            34, 87, 123, 14, 44]
            Descending Integer List: [123, 87,
            52, 46, 44, 34, 14, 12]

            In our last example, we will attempt a more
            complex sort involving two comparisons.
            Let's assume there is a Dog class that contains
            two properties, name and age, along with the
            necessary accessor methods. We will begin by
            adding elements to a new ArrayList and then printing
            the names and ages of each Dog:

            ArrayList<Dogs> dogs = new
            ArrayList<Dogs>();
            dogs.add(new Dogs("Zoey", 8));
            dogs.add(new Dogs("Roxie", 10));
            dogs.add(new Dogs("Kylie", 7));
            dogs.add(new Dogs("Shorty", 14));
            dogs.add(new Dogs("Ginger", 7));
            dogs.add(new Dogs("Penny", 7));
            out.println("Name " + " Age");
            for(Dogs d : dogs) {
                out.println(d.getName() + " " +
            d.getAge());

            Our output should resemble:

            Name Age
            Zoey 8
            Roxie 10
            Kylie 7
            Shorty 14
            Ginger 7
            Penny 7

            Next, we are going to use method chaining and the
            double colon operator to reference methods from
            the Dog class. We first call comparing followed
            by thenComparing to specify the order in which
            comparisons should occur. When we execute the
            code, we expect to see the Dog objects sorted first
            by Name and then by Age:

            dogs.sort(Comparator.comparing(Dogs::getName).
            thenComparing(Dogs::getAge));
            out.println("Name " + " Age");
            for(Dogs d : dogs) {
                out.println(d.getName() + " " +
                g.getAge());
            }

            Our output follows:

            Name Age
            Ginger 7
            Kylie 7
            Penny 7
            Roxie 10
            Shorty 14
            Zoey 8

            Now we will switch the order of comparison.
            Notice how the age of the dog takes priority over
            the name in this version:

            dogs.sort(Comparator.comparing(Dogs::getAge).thenComparing(Dogs::getName));
            out.println("Name " + " Age");
            for(Dogs d : dogs) {
                out.println(d.getName() + " " +
                d.getAge());
            }

            And our putput is:

            Name Age
            Ginger 7
            Kylie 7
            Penny 7
            Zoey 8
            Roxie 10
            Shorty 14
         */
    }
}