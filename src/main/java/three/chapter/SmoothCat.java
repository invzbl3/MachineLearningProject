/*
package three.chapter;

public class SmoothCat {

    public static void main(String[] args) {
            Mat source = Imgcodecs.imread("cat.jpg");
    Mat destination = source.clone();
    for(int i = 0; i < 25; i++) {
        Mat sourceImage = destination.clone();
        Imgproc.blue(sourceImage,
                destination, new Size(3.0, 3.0));
    }
    Imgcodecs.imwrite("smoothCat.jpg",
            destination);
    }
}*/