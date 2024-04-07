/*package four.chapter;

public class SimpleBarChartByCountry {

    public void simpleBarChartByCountry(Stage stage) {

        stage.setTitle("Bar Chart");
        final BarChart<String, Number>
                barChart = new
                BarChart<>(xAxis, yAxis);
        barChart.setTitle("Country Summary");
        xAxis.setLabel("Country");
        yAxis.setLabel("Population");
        // ...
    }
}*/

/**
 * Next, the first three series are initialized with a
 * name, and then the country and population data
 * for that series. A helped method, addDataItem, as
 * introduced in the previous section, is used to add
 * the data to each series:
 */

/*series1.setName("1950");
addDataItem(series1, belgium,
8639369);
addDataItem(series1, france,
42518000);
addDataItem(series1, germany,
68374572);
addDataItem(series1, netherlands,
10113527);
addDataItem(series1, sweden,
7014005);
addDataItem(series1, unitedKingdom,
50127000);

series2. setName("1960");
addDataItem(series2, belgium,
9118700);
addDataItem(series2, france,
46584000);
addDataItem(series2, germany,
72480869);
addDataItem(series2, netherlands,
11486000);
addDataItem(series2, sweden,
7480395);
addDataItem(series2, unitedKingdom,
52372000);

series3.setName("1970");
addDataItem(series3, belgium,
9637800);
addDataItem(series3, france,
51918000);
addDataItem(series3, germany,
77783164);
addDataItem(series3, netherlands,
13032335);
addDataItem(series3, sweden,
8042803);
addDataItem(series3, unitedKingdom,
55632000);

The last part of the method creates a scene
instance. The three series are added to the scene
and the scene is attached to the stage using
the setScene method. A stage is a class that
essentially represents the clinet area of a window:

Scene scene = new Scene(barChart,
        800, 600);
barChart.getData().addAll(series1,
                          series2, series3);
stage.setScene(scene);
stage.show();

The last of the two methods is the start method,
which is called automatically when the window
is displayed. It is passed the Stage instance.
Here, we call the simpleBarChartByCountry method:

public void start(Stage stage) {
    simpleBarChartByCountry(stage);
}

The main method consists of a call to the
Application class's launch method:

public static void main(String[]
args) {
    launch(args);
}

When the application is executed, the following
graph is displayed:
    */

