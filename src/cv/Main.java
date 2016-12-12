package cv;

import Util.FileProcess;
import hw8.GaussianNoise;
import hw8.NoiseCleaning;
import hw8.SaltAndPepperNoise;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] img = FileProcess.inputImg(new File("lena.bmp"));
        int[][] gaussionImg_10 = GaussianNoise.addNoise(img, 10);
        int[][] gaussionImg_30 = GaussianNoise.addNoise(img, 30);
        int[][] saltImg_5 = SaltAndPepperNoise.addNoise(img, 0.05f);
        int[][] saltImg_10 = SaltAndPepperNoise.addNoise(img, 0.1f);
        FileProcess.outputImg(gaussionImg_10, "gaussion10.bmp");
        FileProcess.outputImg(gaussionImg_30, "gaussion30.bmp");
        FileProcess.outputImg(saltImg_5, "salt5.bmp");
        FileProcess.outputImg(saltImg_10, "salt10.bmp");
        List<Point> thrMulThrMask = Mask.create3X3Mask();
        List<Point> fiveMulFiveMask = Mask.create5X5Mask();
        NoiseCleaning noiseCleaning = new NoiseCleaning(gaussionImg_10, thrMulThrMask);
        noiseCleaning.startToClear("gaussion10_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion10_clean_three_rm.bmp", "rm");
        noiseCleaning.setMask(fiveMulFiveMask);
        noiseCleaning.startToClear("gaussion10_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion10_clean_five_rm.bmp", "rm");
        noiseCleaning.setImg(gaussionImg_30);
        noiseCleaning.startToClear("gaussion30_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion30_clean_five_rm.bmp", "rm");
        noiseCleaning.setMask(thrMulThrMask);
        noiseCleaning.startToClear("gaussion30_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion30_clean_three_rm.bmp", "rm");
        noiseCleaning.setImg(saltImg_5);
        noiseCleaning.startToClear("salt5_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("salt5_clean_three_rm.bmp", "rm");
        noiseCleaning.setMask(fiveMulFiveMask);
        noiseCleaning.startToClear("salt5_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("salt5_clean_five_rm.bmp", "rm");
        noiseCleaning.setImg(saltImg_10);
        noiseCleaning.startToClear("salt10_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("salt10_clean_five_rm.bmp", "rm");
        noiseCleaning.setMask(thrMulThrMask);
        noiseCleaning.startToClear("salt10_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("salt10_clean_three_rm.bmp", "rm");

    }
}
