package hw10;

import Util.FileProcess;
import Util.ImageProcess;
import Util.Mask;
import Util.Point;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Selab on 2016/12/27.
 */

public class MainZeroCrossing {
    public static void main(String[] args) throws IOException {
        int[][] img = FileProcess.inputImg(new File("lena.bmp"));
        int[][] outputImg = null;
        List<Point> mask = new ArrayList<>();

        mask = Mask.getLaplacian();
        outputImg = ZeroCrossingEdgeDection.operator(img, mask);
        outputImg = ImageProcess.binaryImage(outputImg, 15);
        FileProcess.outputImg(outputImg, "laplacian_lena.bmp");

        mask = Mask.getMinimunVarianceLaplacian();
        outputImg = ZeroCrossingEdgeDection.operator(img, mask);
        outputImg = ImageProcess.binaryImage(outputImg, 20);
        FileProcess.outputImg(outputImg, "variance_lena.bmp");
    }
}
