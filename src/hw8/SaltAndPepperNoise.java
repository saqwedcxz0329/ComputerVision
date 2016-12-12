package hw8;

import java.util.Random;

/**
 * Created by Selab on 2016/12/11.
 */
public class SaltAndPepperNoise {
    public static int[][] addNoise(int[][] img, float fraction) {
        int height = img.length;
        int width = img[0].length;
        int[][] noiseImg = new int[height][width];
        Random random = new Random();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                float ranNum = random.nextFloat();
                if (ranNum < fraction / 2) {
                    noiseImg[i][j] = 0;
                } else if (ranNum > 1 - fraction / 2) {
                    noiseImg[i][j] = 255;
                } else {
                    noiseImg[i][j] = img[i][j];
                }
            }
        }
        return noiseImg;
    }
}
