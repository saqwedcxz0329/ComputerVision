package hw8;

import Util.FileProcess;
import Util.ImageProcess;

import java.io.IOException;

/**
 * Created by Selab on 2016/12/11.
 */
public class NoiseCleaning {
    int[][] img;
    int windowSize;

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public void setImg(int[][] img) {
        this.img = img;

    }

    public NoiseCleaning(int[][] img, int windowSize){
        this.img = img;
        this.windowSize = windowSize;
    }
    public void startToClear(String outPutFileName, String method) throws IOException {
        int[][] cleanImg = null;
        Clean clean = null;
        switch (method.toLowerCase()){
            case "orc":
                clean = new OutlierRemovalClean(ImageProcess.cloneImg(img), (int)Math.sqrt(windowSize), (int)Math.sqrt(windowSize), 10);
                break;
            case "rm":
                clean = new RunningMedianClean(ImageProcess.cloneImg(img), (int)Math.sqrt(windowSize), (int)Math.sqrt(windowSize));
                break;
        }
        cleanImg = clean.clearNoise();
        FileProcess.outputImg(cleanImg, outPutFileName);
        SNR snr = new SNR(cleanImg, img);
        System.out.println(outPutFileName + ": " + snr.caculateSNR());
    }
}
