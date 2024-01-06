package one.chapter;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public class PerformanceApplication {
    
    public static void main(String[] args) {

        double[][] A = {
                {0.1950, 0.0311},
                {0.3588, 0.2203},
                {0.1716, 0.5931},
                {0.2105, 0.3242}};

        double[][] B = {
                {0.0502, 0.9823, 0.9472},
                {0.5732, 0.2694, 0.916}};

        /**
         * Apache Commons uses the RealMatrix
         * class to store a matrix. Next, we use the
         * Array2DRowRealMatrix constructor to create
         * the corresponding matrices for A and B:
         */
        RealMatrix aRealMatrix = new
                Array2DRowRealMatrix(A);
        RealMatrix bRealMatrix = new
                Array2DRowRealMatrix(B);

        /**
         * We perform multiplication simply using the
         * multiply method:
         */
        RealMatrix cRealMatrix =
                aRealMatrix.multiply(bRealMatrix);

        /**
         * Finally, we use a for loop to display the results:
         */
        for (int i = 0; i < cRealMatrix.getRowDimension(); i++) {

            System.out.println(cRealMatrix.getRowVector(i));
        }

        /**
         * The output is as follows:
         */

        /*{0.02761552; 0.19992684; 0.2131916}
          {0.14428772; 0.41179806; 0.54165016}
          {0.34857924; 0.32834382; 0.70581912}
          {0.19639854; 0.29411363; 0.4963528}*/
    }
}