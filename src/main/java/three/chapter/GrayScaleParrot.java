/*
package three.chapter;

public class GrayScaleParrot {

    public static void main(String[] args) {

        Mat source = Imgcodecs.imread("GrayScaleParrot.png",
                Imgcodecs.CV_LOAD_IMAGE_GRAYSCALE);

        Mat destination = new Mat(source.rows(),
                source.cols(),
                source.type());
        Imgproc.equalizeHist(source,
                destination);
        Imgcodecs.imwrite("enhancedParrot.jpg", destination);
    }
}*/
