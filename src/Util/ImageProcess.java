package Util;

/**
 * Created by Selab on 2016/12/11.
 */

public class ImageProcess {

    public static int[][] cloneImg(int[][] img){
        int height = img.length;
        int width = img[0].length;
        int[][] cloneImg = new int[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                cloneImg[i][j] = img[i][j];
            }
        }
        return cloneImg;
    }

    public static int[][] binaryImage(int[][] oriImg, int threshold) {
        int height = oriImg.length;
        int width = oriImg[0].length;
        int[][] processImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                processImg[i][j] = (oriImg[i][j] >= threshold) ? 255 : 0;
            }
        }
        return processImg;
    }

    public static int[][] downSampling(int[][] oriImg, int height, int width, int unitX, int unitY) {
        int[][] processImg = new int[height][width];
        for (int i = 0; i < height; i += unitX) {
            for (int j = 0; j < width; j += unitY) {
                processImg[i / unitX][j / unitY] = oriImg[i][j];
            }
        }
        return processImg;
    }
}
