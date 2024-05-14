package four.chapter;

/*public class SimpleBarChartByYear {

    public void simpleBarChartByYear(Stage stage) {

        state.setTitle("Bar Chart");
        final BarChart<String, Number> barChart =
                new BarChart<>(xAxis, yAxis);

        barChart.setTitle("Year Summary");
        xAxis.setLabel("Year");
        yAxis.setLabel("Population");
        // ...
    }
}*/

/**
 * The following string variables are declared for the
 * three decades:
 *
 * String year1950 = "1950";
 * String year1960 = "1960";
 * String year1970 = "1970";
 *
 * The data series are created in the same way as
 * before, except the country name is used for the
 * series name and the year is used for the category.
 * In addition, six series are used, one for each
 * country:
 *
 * series1.setName(belgium);
 * addDataItem(series1, year1950,
 * 8639369);
 * addDataItem(series1, year1960,
 * 9118700);
 * addDataItem(series1, year1970,
 * 9637800);
 *
 * series2.setName(france);
 * addDataItem(series2, year1950,
 * 42518000);
 * addDataItem(series2, year1960,
 * 46584000);
 * addDataItem(series2, year1970,
 * 51918000);
 *
 * series3.setName(germany);
 * addDataItem(series3, year1950,
 * 68374572);
 * addDataItem(series3, year1960,
 * 72480869);
 * addDataItem(series3, year1970,
 * 77783164);
 *
 * series4.setName(netherlands);
 * addDataItem(series4, year1950,
 * 10113527);
 * addDataItem(series4, year1960,
 * 11486000);
 * addDataItem(series4, year1970,
 * 13032335);
 *
 * series5.setName(sweden);
 * addDataItem(series5, year1950,
 * 7014005);
 * addDataItem(series5, year1960,
 * 7480395);
 * addDataItem(series5, year1970,
 * 8042803);
 *
 * series6.setName(unitedKingdom);
 * addDataItem(series6, year1950,
 * 50127000);
 * addDataItem(series6, year1960,
 * 52372000);
 * addDataItem(series6, year1970,
 * 55632000);
 *
 * The scene is created and attached to the stage:
 *
 * Scene scene = new Scene(barChart,
 * 800, 600);
 * barChart.getData().addAll(series1,
 * series2,
 *  series3, series4, series5,
 *  series6);
 * stage.setScene(scene);
 * stage.show();
 *
 * The main method is unchanged, but the start
 * method calls the simpleBarChartByYear
 * method instead:
 *
 * public void start(Stage stage) {
 *     simpleBarChartByYear(stage);
 * }
 *
 * When the application is executed, the following
 * graph is displayed:
 */