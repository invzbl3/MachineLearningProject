package four.chapter;

/*
public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // ...
    }

    public static void main(String[] args) {
        launch(args);
    }
}

Within the start method we set the title,
create the axes, and create an instance of the
ScatterChart that represents the scatter plot.
The NumberAxis class's constructors used values
that better match the data range than the default
values used by its default constructor:

stage.setTitle("Scatter Chart
Sample");
final NumberAxis yAxis = new
NumberAxis(1400, 2100, 100);
final NumberAxis xAxis = new
NumberAxis(500000, 90000000,
    1000000);

final ScatterChart<Number, Number>
scatterChart = new
    ScatterChart<>(xAxis, yAxis);

Next, the axes's labels are set along with the scatter
chart's title:

xAxis.setLabel("Population");
yAxis.setLabel("Decade");
scatterChart.setTitle("Population
Scatter Graph");

An instance of the XYChart.Series class is
created and named:

XYChart.Series series = new
XYChart.Series();

The series is populated using a
CSVReader class instance and the file
EuropeanScatterData.csv. This Process was
discussed in Chapter 3, Data Cleaning:

try CSVReader dataReader = new
CSVReader(new
FileReader ("EuropeanScatterData.csv"
), ',')) {
    String[] nextLine;
    while ((nextLine =
    dataReader.readNext()) != null) {
    int decade =
    Integer. parseInt(nextLine[0]);
        int population = Integer.parseInt(nextLine[1]);
            series.getData().add(new
            XYChart.Data(
                            population, decade));
                         out.println("Decade: " +
            decade +
                         "  Population: " +
            population);
                }
        }
        scatterChart.getData().addAll(series);

The JavaFX scene and stage are created, and then the plot
is displayed:

Scene scene = new Scene(scatterChart,
500, 400);
stage.setScene(scene);
stage.show();

When the application is executed, the following
graph is displayed:
*/