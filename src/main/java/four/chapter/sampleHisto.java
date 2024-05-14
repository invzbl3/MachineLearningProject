/*
package four.chapter;

public class sampleHisto {

    Number ageRange[] = {19, 20, 21, 22, 23
    24, 25, 26, 27, 28, 29, 30};
    Histogram sampleHisto = new Histogram1D(histoData,
            Orientation.VERTICAL, ageRange);
    DataSource sampleHistData = new
            EnumeratedData(sampleHisto, 19, 1.0);
}

We use the BarPlot class to create our histogram
from the data we read in earlier:

BarPlot testPlot = new
BarPlot(sampleHistData);

The next few steps serve to format various aspects
of our histogram. We use the setInsets method to specify
how much space to place around each side of the graph
within the window. We can provide a title for our graph
and specify the bar width:

testPlot.setInsets(new
Insets2D.Double(20.0, 50.0, 50.0, 20.0));
testPlot.getTitle().setText("Average
Age of Marriage");
testPlot.setBarWidth(0.7);

We also need to format our X and Y axes. We
have chosen to set our range for the X axis to
closely match our expected age range but to
provide some space on the side of the graph.
Because we know the amount of sample data,
we set our Y axis to range from 0 to 10. In a
business application, these ranges would be
calculated by examining the actual dataset. We
can also specify whether we want tick marks
to show and where we would like the axes to intersect:

testPlot.getAxis(BarPlot.AXIS_X).set
Range(18, 30.0);
testPlot.getAxisRenderer(BarPlot.AXI
S_X).setTickAlignment(0.0);
testPlot.getAxisRenderer(BarPlot.AXIS_X).setTickSpacing(1);
testPlot.getAxisRenderer(BarPlot.AXIS_X)
.setMinorTicksVisible(false );

testPlot.getAxis(BarPlot.AXIS_Y).setRange(0.0, 10.0);
testPlot.getAxisRenderer(BarPlot.AXIS_Y)
.setTickAlignment(0.0);
testPlot.getAxisRenderer(BarPlot.AXIS_Y).
setMinorTicksVisible(false );
testPlot.getAxisRenderer(BarPlot.AXIS_Y).setIntersection(0);

We also have a lot of flexibility with the color and
values displayed on the graph. In this example,
we have chosen to display the frequency value for
each age and set our graph color to black:

PointRenderer renderHist =

testPlot.getPointRenderers(sampleHistData).get(0);
renderHist.setColor(GraphicsUtils.deriveWithAlpha(Color.black, 128));
renderHist.setValueVisible(true);

Finally, we set several properties for how we want
our window to display:

InteractivePanel pan = new
InteractivePanel(testPlot);
pan.setPannable(false);
pan.setZoomable(false);
add(pan);
setSize(1500, 700);
this.setVisible(true);

When the application is executed, the following
graph is displayed:
*/