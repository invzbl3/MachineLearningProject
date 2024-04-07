package four.chapter;

//public class SimpleIndexChart {
//
//    public static void main(String[] args) {
//
//        launch(args);
//    }
//
//    public void start(Stage stage) {
//        simpleIndexChart(stage);
//    }
//}

/**
 * The simpleLineChart follows and is passed an
 * instance of the Stage class. This represents the
 * client area of the application's window. We start by
 * setting a title for the application and the line chart
 * proper. The label of the Y axis is set. An instance
 * of the LineChart class is initialized using the X
 * and Y axis instances. This class represents the line
 * chart:
 */


/*public void simpleIndexChart(Stage stage) {
    stage.setTitle("Index Chart");
    lineChart.setTitle("Belgium Population");
    yAxis.setLabel("Population");
    final LineChart<String, Number> lineChart =
            new LineChart<>(xAxis, yAxis);

    // ...
}*/

/**
 * The series is given a name, and then the population
 * for each decade is added to the series using the
 * addDataItem helper method:
 */

/*series.setName("Population");
addDataItem(series, "1950", 8639369);
addDataItem(series, "1960", 9118700);
addDataItem(series, "1970", 9637800);
addDataItem(series, "1990", 9969310);
addDataItem(series, "2000", 10263618);*/

/**
 * The addDataItem method follows, which creates
 * an XYChart. Data class instance using the
 * String and Number values passed to it. It then
 * adds the instance to the series:
 */

/*public void addDataItem(XYChart.Series<String,
                        Number> series,
                            String x, Number y) {
    series.getData().add(new
            XYChart.Data<>(x, y));
}*/

/**
 * The last part of the simpleLineChart method
 * creates a Scene class instance that represents the
 * content of the stage. JavaFX uses the concept of
 * a stage and scene to deal with the internals of the
 * application's GUI.
 */

/**
 * The scene is created using a line chart, and the
 * application's size is set to 800 by 600 pixels. The
 * series is then added to the line chart and scene
 * is added to stage. The show method displays the
 * application:
 */

/*
    Scene scene = new Scene(lineChart,
    800, 600);
    lineChart.getData().add(series);
    stage.setScene(scene0;
    stage.show();
 */

/**
 * When the application executes the following
 * window will be displayed:
 */