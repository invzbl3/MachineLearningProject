package four.chapter;

/*import java.util.Arrays;

public class StackedGraphExample {

    public void stackedGraphExample(Stage stage) {

        stage.setTitle("Stacked Bar Chart");
        final StackedBarChart<String, Number> stackedBarChart
                = new
                StackedBarChart<>(xAxis, yAxis);
            stackedBarChart.setTitle("Country Population");
            xAxis.setLabel("Country");
            xAxis.setCategories(FXCollections.<String>observableArrayList(Arrays.asList(belgium, germany, france,
                                                                                                                    netherlands,
                                                                                        sweden, unitedKingdom)));
                                                                                            yAxis.setLabel("Population");
            // ...
    }
}

The series are initialized with the year being used
for the series name and the country, and their
population being added using the helper method
addDataItem. The scene is then created:

series1.setName("1950");
addDataItem(series1, belgium, 8639369);
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

series2.setName("1960");
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

Scene scene = new
Scene(stackedBarChart, 800, 600);
stackedBarChart.getData().addAll(series1,
series2, series3);
stage.setScene(scene);
stage.show();

The main method is unchanged, but the start
method calls the stackedGraphExample
method instead:

public void start(Stage stage) {

    stackedGraphExample(stage);
}

When the application is executed, the following
graph is displayed:
*/