package hw8;

import Util.ImageProcess;
import cv.Point;

import java.util.*;

/**
 * Created by Selab on 2016/12/12.
 */
public class RunningMedianClean extends Clean {

    public int[][] clearNoise(int[][] inputImg, int windowHeight, int windowWidth, int theata) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int edgeX = (int)Math.floor(windowHeight / 2);
        int edgeY = (int)Math.floor(windowWidth / 2);
        int[][] outPutImg = ImageProcess.cloneImg(inputImg);
        int[] window = new int[windowHeight * windowWidth];
        for (int i = edgeX; i < height - windowHeight; i++) {
            for (int j = edgeY; j < width - windowWidth; j++) {
                int m = 0;
                for(int fx = 0; fx < windowHeight; fx++){
                    for(int fy = 0; fy < windowWidth; fy++){
                        window[m] = inputImg[i + fx - edgeX][j + fy - edgeY];
                        m += 1;
                    }
                }
                Arrays.sort(window);
                int N = window.length;
                int median = window[((int) Math.floor((N + 1) / 2)) - 1];
                int x1 = window[((int) Math.floor((3 * N + 2) / 4)) - 1];
                int x2 = window[((int) Math.floor((N + 2) / 4)) - 1];
                float Q = x1 - x2;
                if(Math.abs((outPutImg[i][j] - median) / Q) >= theata){
                    outPutImg[i][j] = median;
                }
            }
        }
        return outPutImg;
    }
}
