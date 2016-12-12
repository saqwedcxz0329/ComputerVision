package hw8;
import java.util.Random;
/**
 * Created by Selab on 2016/12/11.
 */
public class GaussianNoise {
    public static int[][] addNoise(int[][] img, float amp){
        int height = img.length;
        int width = img[0].length;
        int[][] noiseImg = new int[height][width];
        Random random = new Random();
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                noiseImg[i][j] = img[i][j] + Math.round((float)(amp * random.nextGaussian()));
            }
        }
        return noiseImg;
    }
}
