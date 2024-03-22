package three.chapter;

import static java.lang.System.out;
public class DataImputation {

    public static void main(String[] args) {
        double[] tempList =
                {50, 56, 65, 70, 74, 80, 82, 90, 83, 78, 64, 52
                };
        /*double sum = 0;

        for (double d : tempList) {
            sum += d;
        }

        out.printf("The average temperature is %1$, .2f", sum / 12);*/

    /*Notice that for the numbers used in this execution,
    the output is as follows:

    The average temperature is 70.33

    Next we will mimic missing data by changing
    the first element of our array to zero before we
    calculate our sum:  */

        double sum = 0;
        tempList[0] = 0;
        for (double d : tempList) {
            sum += d;
        }
        out.printf("The average temperature is %1$, .2f", sum / 12);

        /*This will change the average temperature
        displayed in our output:

        The average temperature is 66.17*/
    }
}