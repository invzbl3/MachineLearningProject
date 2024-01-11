package one.chapter;

/**
 * Chapter 1. Getting Started with Data Science
 */
public class MultiLayer {
    public static void main(String[] args) {

        /*MultiLayerConfiguration conf = new
                NeuralNetConfiguration.Builder()
                    .seed(seed)
                    .iterations(numberOfIterations)
                    .optimizationAlgo(
                OptimizationAlgorithm.LINE_GRADIENT_DESCENT
                    )
                    .list()
                    .layer(0, new RBM.Builder()
                       .nIn(numberOfRows *
                               numberOfColumns).nOut(1000)
                            .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                            .build())
                    .layer(1, new
                            RBM.Builder().nln(1000).nOut(500)
                                .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                                    .build())
                            .layer(3, new
                                    RBM.Builder().nIn(1000).nOut(500)
                                        .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                                            .build())
                            .layer(2, new
                    RBM.Builder().nIn(250).nOut(100)
                                    .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                                    .build())
                            .layer(4, new
                                    RBM.Builder().nIn(100).nOut(30)
                                        .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                                    .build)) // encoding stops
                            .layer(5, new
                RBM.Builder().nIn(30).nOut(100)
                            .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                            .build()) // decoding starts
                    .layer(6, new
                            RBM.Builder().nIn(100).nOut(250)
                            .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                            .build())
                .layer(7, new
                        RBM.Builder().nIn(250).nOut(500)
                        .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                        .build())
                .layer(8, new
                        RBM.Builder().nIn(500).nOut(1000)
                        .lossFunction(LossFunctions.LossFunction.RMSE_XENT)
                        .build())
                .layer(9, new OutputLayer.Builder(
                        LossFunctions.LossFunction.RMSE_XENT).nIn(1000)
                        .nOut(numberOfRows *
                                numberOfColumns).build())
                .pretrain(true).backprop(true)
                .build();*/
    }
}