package hw5;

import Util.Point;

import java.util.Set;

/**
 * Created by Louis on 2016/12/12.
 */
public class GrayScaleMorphology {

    public int[][] dilation(int[][] inputImg, Set<Point> bSet) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int[][] outputImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int max = 0;
                for (Point point : bSet) {
                    int x = point.getX();
                    int y = point.getY();
                    int value = (int)point.getValue();
                    if (i - x > 0 && j - y > 0 && i - x < height && j - y < width) {
                        int grayValue = inputImg[i - x][j - y] + value;
                        if (grayValue > max) {
                            max = grayValue;
                        }
                    }
                }
                outputImg[i][j] = max;
            }
        }
        return outputImg;
    }

    public int[][] erosion(int[][] inputImg, Set<Point> bSet) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int[][] outputImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int min = 255;
                for (Point point : bSet) {
                    int x = point.getX();
                    int y = point.getY();
                    int value = (int)point.getValue();
                    if (i + x > 0 && j + y > 0 && i + x < height && j + y < width) {
                        int grayValue = inputImg[i + x][j + y] - value;
                        if (grayValue < min) {
                            min = grayValue;
                        }
                    }
                }
                outputImg[i][j] = min;
            }
        }
        return outputImg;
    }

    public int[][] closing(int[][] grayImg, Set<Point> bSet) {
        int[][] dilationImgArray = dilation(grayImg, bSet);
        return erosion(dilationImgArray, bSet);
    }

    public int[][] opening(int[][] grayImg, Set<Point> bSet) {
        int[][] erosionImgArray = erosion(grayImg, bSet);
        return dilation(erosionImgArray, bSet);
    }
}
