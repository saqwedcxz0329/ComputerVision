package hw8;

import Util.ImageProcess;
import cv.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by Selab on 2016/12/12.
 */
public class RunningMedianClean extends Clean {

    public int[][] clearNoise(int[][] inputImg, List<Point> maskList, int theata) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int[][] outPutImg = ImageProcess.cloneImg(inputImg);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                List<Integer> neiborhood = new ArrayList<>();
                for (Point point : maskList) {
                    int neighborhoodValue = 0;
                    if (point.getX() != 0 && point.getY() != 0) {
                        int m = i + point.getX();
                        int n = j + point.getY();
                        int value = point.getValue();
                        if (m > 0 && m < height && n > 0 && n < width) {
                            neighborhoodValue = outPutImg[m][n] * value;
                        }
                    }
                    neiborhood.add(neighborhoodValue);
                }
                Collections.sort(neiborhood);
                int N = neiborhood.size();
                int median = neiborhood.get((int) Math.floor((N + 1) / 2));
                int x1 = neiborhood.get((int) Math.floor((3 * N + 2) / 4));
                int x2 = neiborhood.get((int) Math.floor((N + 2) / 4));
                float Q = x1 - x2;
                if(Math.abs((outPutImg[i][j] - median) / Q) >= theata){
                    outPutImg[i][j] = median;
                }
            }
        }
        return outPutImg;
    }
}
