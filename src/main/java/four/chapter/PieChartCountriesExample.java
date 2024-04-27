/*
package four.chapter;

public class PieChartCountriesExample {
    public static void main(String[] args) {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Belgium",
                                3),
                        new PieChart.Data("France",
                                26),
                        new PieChart.Data("Germany",
                                35)
        new PieChart.Data("Netherlands",
                7),
                new PieChart.Data("Sweden",
                        4),
                new PieChart.Data("United
                        Kingdom", 25));
    }
}

We then create the pie chart and set its title. The
pie chart is then added to the scene, the scene is
associated with the stage, and then the window
is displayed:

final PieChart pieChart = new
PieChart(pieChartData);
pieChart.setTitle("Country
Population");
((Group)
scene.getRoot()).getChildren().add(p
ieChart);
stage.setScene(scene);
stage.show();

When the application is executed, the following
graph is displayed:
*/