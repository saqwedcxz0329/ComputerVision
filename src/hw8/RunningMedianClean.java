package hw8;

import Util.ImageProcess;

import java.util.*;

/**
 * Created by Selab on 2016/12/12.
 */
public class RunningMedianClean extends Clean {

    public RunningMedianClean(int[][] inputImg, int windowHeight, int windowWidth){
        super(inputImg, windowHeight, windowWidth);
    }


    public int[][] clearNoise() {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int edgeX = (int)Math.floor(windowHeight / 2);
        int edgeY = (int)Math.floor(windowWidth / 2);
        int[][] outPutImg = inputImg;
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
                outPutImg[i][j] = median;
            }
        }
        return outPutImg;
    }
}
