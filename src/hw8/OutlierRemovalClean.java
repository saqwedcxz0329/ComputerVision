package hw8;

import Util.ImageProcess;
import cv.Point;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Selab on 2016/12/12.
 */
public class OutlierRemovalClean extends Clean {
    public int[][] clearNoise(int[][] inputImg, List<Point> maskList, int theata) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int[][] outPutImg = ImageProcess.cloneImg(inputImg);
//        int[][] outPutImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int neighborhoodSum = 0;
                int N = 0;
                for (Point point : maskList) {
                    int neighborhoodValue = 0;
                    if (point.getX() != 0 && point.getY() != 0) {
                        int m = i + point.getX();
                        int n = j + point.getY();
                        int value = point.getValue();
                        if (m > 0 && m < height && n > 0 && n < width) {
                            neighborhoodValue = outPutImg[m][n] * value;
                        }
                        N += value;
                    }
                    neighborhoodSum += neighborhoodValue;
                }
                float meanValue = neighborhoodSum / N;
//                outPutImg[i][j] = inputImg[i][j];
                if (Math.abs(outPutImg[i][j] - meanValue) >= theata) {
                    outPutImg[i][j] = Math.round(meanValue);
                }
            }
        }
        return outPutImg;
    }
}
