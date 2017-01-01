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

    public static int[][] operator(int[][] inputImg, int sigma1, int sigma2) {
        int height = inputImg.length;
        int width = inputImg[0].length;
//        int[][] outputImg = new int[height][width];
        int[][] outputImg = ImageProcess.cloneImg(inputImg);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
//                double g1 = gaussion(i, j, sigma1) * inputImg[i][j];
//                double g2 = gaussion(i, j, sigma2) * inputImg[i][j];
//                outputImg[i][j] = (int) Math.round(g1 - g2);
                outputImg[i][j] = (int) Math.round(gaussion(i, j, sigma1, sigma2) * outputImg[i][j]);
            }
        }
        return outputImg;
    }

    private static double gaussion(int x, int y, int sigma) {
        double a1 = Math.exp(((x * x) + (y * y)) / (-2 * sigma * sigma));
        double a2 = (Math.sqrt(2 * Math.PI * sigma * sigma));
        return a1 / a2;
    }

    private static double gaussion(int x, int y, int sigma1, int sigma2) {
        double a1 = Math.exp(((x * x) + (y * y)) / (-2 * sigma1 * sigma1)) / sigma1;
        double b1 = Math.exp(((x * x) + (y * y)) / (-2 * sigma2 * sigma2)) / sigma2;
        double z = (Math.sqrt(2 * Math.PI));
        return (a1 - b1) / z;
    }
}
