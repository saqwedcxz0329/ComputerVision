package hw8;

import Util.FileProcess;
import cv.Point;

import java.io.IOException;
import java.util.List;

/**
 * Created by Selab on 2016/12/11.
 */
public class NoiseCleaning {
    int[][] img;
    List<Point> mask;

    public void setImg(int[][] img) {
        this.img = img;

    }

    public void setMask(List<Point> mask) {
        this.mask = mask;
    }

    public NoiseCleaning(int[][] img, List<Point> mask){
        this.img = img;
        this.mask = mask;
    }
    public void startToClear(String outPutFileName, String method) throws IOException {
        int[][] cleanImg = null;
        Clean clean = null;
        switch (method.toLowerCase()){
            case "orc":
                clean = new OutlierRemovalClean();
                break;
            case "rm":
                clean = new RunningMedianClean();
                break;
        }
        cleanImg = clean.clearNoise(img, mask, 10);
        FileProcess.outputImg(cleanImg, outPutFileName);
    }
}
