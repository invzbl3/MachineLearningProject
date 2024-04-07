/*
package four.chapter;

public class MainAppTwo extends Application {

    final static String belgium = "Belgium";
    final static String france = "France";
    final static String germany = "Germany";
    final static String netherlands = "Netherlands";
    final static String sweden = "Sweden";
    final static String unitedKingdom = "United Kingdom";

    // ...
}

Next, we declared a series of instance variables
that represent the parts of a graph. The first are
CategoryAxis and NumberAxis instances:

final CategoryAxis xAxis = new
CategoryAxis();
final NumberAxis yAxis = new
NumberAxis();

The population and country data is stored in a
series of XYChart.Series instances. Here, we
have declared six different series, which use a
string and number pair. The first example does
not use all six series, but later examples will.

We will initially assign a country string and its
corresponding population to three series. These
series will represent the populations for the
decades 1950, 1960, and 1970:

final XYChart.Series<String, Number>
series1 =
    new XYChart.Series<>();
final XYChart.Series<String, Number>
series2
    new XYChart.Series<>();
final XYChart.Series<String, Number>
series3 =
    new XYChart.Series<>();
final XYChart.Series<String, Number>
series4 =
    new XYChart.Series<>();
final XYChart.Series<String, Number>
series5 =
    new XYChart.Series<>();
final XYChart.Series<String, Number>
series6 =
    new XYChart.Series<>();

We will start with two simple bar charts. The first
one will show the countries as categories where
the yar changes occur within the category on the
X axis and the population along the Y axis. The
second shows the decades as categories containing
the counties. The last example is a stacked bar
chart.
*/
