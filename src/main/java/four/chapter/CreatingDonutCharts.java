package four.chapter;

public class CreatingDonutCharts {

    /*DataTable donutData = new
    DataTable(Integer.class,
    Integer.class);
    for(int Y = 0; Y <
    ageCount[0].length; y++) {
        if(ageCount[1][y] == 0) {
            donutData.add(-3, ageCount[0]
    [y]);
        } else {
            donutData.add(ageCount[1][y],
                    ageCount[0][y]);
        }
    }*/

    /**
     * Next, we create our donut plot using the PiePlot
     * class. We set basic properties of the plot, including
     * specifying the values for the legend. In this case,
     * we want our legend to reflect our age possibilities,
     * so we use the setLabelColumn method to change
     * the default labels. We also set our insets as we did
     * in the previous example:
     */

    /*
        PiePlot testPlot = new PiePlot(donutData);
        ((ValueLegend)
        testPlot.getLegend()).setLabelColumn(1);
        testPlot.getTitle().setText("Donut Plot Example");
        testPlot.setRadius(0.9);
        testPlot.setLegendVisible(true);
        testPlot.setInsets(new Insets2D.Double(20.0, 20.0,
        20.0, 20.0));
     */

    /**
     * Next, we create a PieSliceRenderer object to set
     * more advance properties. Because a donut plot
     * is basically a pie plot in essence, we will render a
     * donut plot by calling the setInnerRadius method.
     * We also specify the gap between the pie slices, the
     * colors used, and the style of the labels:
     */

    /*
        PieSliceRenderer renderPie = (PieSliceRenderer)
        testPlot.getPointRenderer(donutData);
        renderPie.setInnerRadius(0.4);
        renderPie.setGap(0.2);
        LinearGradient colors = new LinearGradient(
            Color.blue, Color.green);
        renderPie.setColor(colors);
        renderPie.setValueVisible(true);
        renderPie.setValueColor(Color.WHITE);
        renderPie.setValueFont(Font.decode(null).deriveF
        ont(Font.BOLD));

        Finally, we crate our panel and set its size:

        add(new InteractivePanel(testPlot),
        BorderLayout.CENTER);
        setSize(1500, 700);
        setVisible(true);

        When the application is executed, the following
        graph is displayed:
     */
}