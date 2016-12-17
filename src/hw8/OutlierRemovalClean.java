package hw8;

import Util.ImageProcess;

/**
 * Created by Selab on 2016/12/12.
 */
public class OutlierRemovalClean extends Clean {
    int theata;

    public OutlierRemovalClean(int[][] inputImg, int windowHeight, int windowWidth, int theata){
        super(inputImg, windowHeight, windowWidth);
        this.theata = theata;
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

                float meanValue = mean(window);
                if (Math.abs(outPutImg[i][j] - meanValue) >= theata) {
                    outPutImg[i][j] = Math.round(meanValue);
                }
            }
        }
        return outPutImg;
    }

    private float mean(int[] window){
        int sum = 0;
        for(int i = 0; i < window.length; i++){
            sum += window[i];
        }
        return sum / window.length;
    }
}
