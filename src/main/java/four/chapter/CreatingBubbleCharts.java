package four.chapter;

public class CreatingBubbleCharts {

    /**
     * Bubble charts are similar to scatter plots except
     * they represent data with three dimensions. The
     * first two dimenstions are expressed on the X and Y
     * axes and the third is represented by the size of the
     * point plotted. This can be helpful in determining
     * relationships between data values.
     *
     * We will again use the DataTable class to initially
     * hold the data to be displayed. In this example,
     * we will read data from a sample file called
     * MarriageByYears.csv. This is also a CSV file, and
     * contains one column representing the year a
     * marriage occurred, a second column holding the
     * age at which a person was married, and a third
     * column holding integers representing marital
     * satisfaction on a scale from 1 (least satisfied)
     * to 10 (most satisfied). We create a DataSeries to
     * represent our type of desired data plot and then
     * create a XYPlot object:
     */

    DataReader readType =
            DataReaderFactory.getInstance().get("text/csv");
    String fileName = "C://MarriageByYears.csv";
    try {
        DataTable bubbleData = (DataTable)
                readType.read(
                        new FileInputStream(fileName), Integer.class,
                        Integer.class, Integer.class);
        DataSeries bubbleSeries = new
                DataSeries("Bubble", bubbleData);
        XYPlot testPlot = new XYPlot(bubbleSeries);
    }

    /**
     * Next, we set basic property information about our
     * chart. We will set the color and turn off the vertical
     * and horizontal grids in this example. We will also
     * make our X and Y axes invisible in this example.
     * Notice that we still set a range for the axes, even
     * though they are not displayed:
     */

    testPlot.setInsets(new Insets2D.Double(30.0));
    testPlot.setBackground(new Color(0.75f, 0.75f,
    0.75f));
    XYPlotArea2D areaProp = (XYPlotArea2D)
            testPlot.getPlotArea();
    areaProp.setBorderColor(null);
    areaProp.setMajorGridX(false);
    areaProp.setMajorGridY(false);
    areaProp.setClippingArea(null);

    testPlot.getAxisRenderer(XYPlot.AXIS_X).setShap
    eVisible(false);
    testPlot.getAxisRenderer(XYPlot.AXIS_X).setTicks
    Visible(false);
    testPlot.getAxisRenderer(XYPlot.AXIS_Y).setShap
    eVisible(false);
    testPlot.getAxisRenderer(XYPlot.AXIS_Y).setTicks
    Visible(false);
    testPlot.getAxis(XYPlot.AXIS_X).setRange(1940,
    2020);
    testPlot.getAxis(XYPlot.AXIS_Y).setRange(17, 30);

    /**
     * We can also set properties related to the bubbles
     * drawn on the chart. Here, we set the color and
     * shape, and specify which column of the data will
     * be used to scale the shapes. In this case, the third
     * column, with the marital satisfaction rating, will
     * be used. We set it using the setColumn method:
     */

    Color color =
            GraphicsUtils.deriveWithAlpha(Color.black, 96);
    SizeablePointRenderer renderBubble = new
            SizeablePointRenderer();
    renderBubble.setShape(new
            Ellipse2D.Double(-3.5, -3.5, 4.0, 4.0));
    renderBubble.setColor(color);
    renderBubble.setColumn(2);
    testPlot.setPointRenderers(bubbleSeries,
            renderBubble);

    /**
     * Finally, we create our panel and set its size:
     */

    add(new InteractivePanel(testPlot)),
    BorderLayout.CENTER);
    setSize(new Dimension(1500, 700));
    setVisible(true);

    /**
     * When the application is executed, the following
     * graph is displayed. Notice both the size and color of
     * the points changes depending upon the frequency
     * of that particular data point:
     */
}