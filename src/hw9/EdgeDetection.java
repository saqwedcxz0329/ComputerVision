package hw9;

import Util.Mask;
import Util.Point;

import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by Louis on 2016/12/17.
 */
public class EdgeDetection {
    public static int[][] operator(int[][] inputImg, List<List<Point>> maskList, String method) {
        int height = inputImg.length;
        int width = inputImg[0].length;
        int[][] outputImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int outputValue = 0;
                int maxGi = Integer.MIN_VALUE;
                for(List<Point> mask: maskList){
                    int Gi = 0;
                    for (Point point: mask){
                        int x = point.getX();
                        int y = point.getY();
                        double value = point.getValue();
                        int pixel = i + x < height && j + y < width && i + x > 0 && j + y > 0 ? inputImg[i + x][j + y] : 0;
                        Gi += pixel * value;
                    }
                    if(Gi > maxGi){
                        maxGi = Gi;
                    }
                    outputValue += Gi * Gi;
                }
                switch (method.toLowerCase()){
                    case "one":
                        outputValue = (int) (Math.round(Math.sqrt(outputValue)));
                        outputImg[i][j] = outputValue;
                        break;
                    case "two":
                        outputImg[i][j] = maxGi;
                        break;
                }

            }
        }
        return outputImg;
    }
}
