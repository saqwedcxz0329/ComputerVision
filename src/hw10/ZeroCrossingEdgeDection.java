package hw10;

import Util.ImageProcess;
import Util.Point;

import java.util.List;

/**
 * Created by Selab on 2016/12/27.
 */

public class ZeroCrossingEdgeDection {
    public static int[][] operator(int[][] inputImg, List<Point> mask) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int[][] outputImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                double newPixel = 0;
                for (Point point : mask) {
                    int x = point.getX();
                    int y = point.getY();
                    double value = point.getValue();
                    int pixel = i + x < height && j + y < width && i + x > 0 && j + y > 0 ? inputImg[i + x][j + y] : 0;
                    newPixel = newPixel + value * pixel;
                }
                outputImg[i][j] = (int) Math.round(newPixel);

            }
        }
        return outputImg;
    }
}
