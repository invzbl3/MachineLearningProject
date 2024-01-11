package one.chapter;

import weka.classifiers.Evaluation;
import weka.classifiers.functions.MultilayerPerceptron;
import weka.core.Instances;
import java.io.FileReader;

/**
 * Chapter 1. Getting Started with Data Science
 */
public class TrainingFile {

    public static void main(String[] args) {

        String trainingFileName = "dermatologyTrainingSet.arff"; // file content missing
        String testingFileName = "dermatologyTestingSet.arff"; // file content missing

        try (FileReader trainingReader = new
                FileReader(trainingFileName); FileReader testingReader =
                     new
                             FileReader(testingFileName)) {
            Instances trainingInstances = new
                    Instances(trainingReader);
            trainingInstances.setClassIndex(
                    trainingInstances.numAttributes() - 1);
            Instances testingInstances = new
                    Instances(testingReader);

            testingInstances.setClassIndex(
                    testingInstances.numAttributes() - 1);

            MultilayerPerceptron mlp = new
                    MultilayerPerceptron();
            mlp.setLearningRate(0.1);
            mlp.setMomentum(0.2);
            mlp.setTrainingTime(2000);
            mlp.setHiddenLayers("3");

            mlp.buildClassifier(trainingInstances);
            // ...

            Evaluation evaluation = new
                    Evaluation(trainingInstances);
            evaluation.evaluateModel(mlp, testingInstances);

            System.out.println(evaluation.toSummaryString());

        } catch (Exception ex) {
            // Handle exceptions
        }
    }
}