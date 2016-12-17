package hw8;

import Util.FileProcess;
import Util.Mask;
import hw5.GrayScaleMorphology;

import java.io.File;
import java.io.IOException;

/**
 * Created by Louis on 2016/12/13.
 */
public class MainNoiseRemoval {
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
        SNR snr = null;
        snr = new SNR(img, gaussionImg_10);
        System.out.println("gaussion10: " + snr.caculateSNR());
        snr = new SNR(img, gaussionImg_30);
        System.out.println("gaussion30: " + snr.caculateSNR());
        snr = new SNR(img, saltImg_5);
        System.out.println("S&P5: " + snr.caculateSNR());
        snr = new SNR(img, saltImg_10);
        System.out.println("S&P10: " + snr.caculateSNR());

        int[][] outputImg = null;
        GrayScaleMorphology grayScaleMorphology = new GrayScaleMorphology();
        outputImg = grayScaleMorphology.opening(gaussionImg_10, Mask.getBSet());
        outputImg = grayScaleMorphology.closing(outputImg, Mask.getBSet());
        snr = new SNR(outputImg, gaussionImg_10);
        System.out.println("gaussion10_open: " + snr.caculateSNR());
        FileProcess.outputImg(outputImg, "gaussion10_clean_open.bmp");
        outputImg = grayScaleMorphology.opening(gaussionImg_30, Mask.getBSet());
        outputImg = grayScaleMorphology.closing(outputImg, Mask.getBSet());
        snr = new SNR(outputImg, gaussionImg_30);
        System.out.println("gaussion30_open: " + snr.caculateSNR());
        FileProcess.outputImg(outputImg, "gaussion30_clean_open.bmp");
        outputImg = grayScaleMorphology.opening(saltImg_5, Mask.getBSet());
        outputImg = grayScaleMorphology.closing(outputImg, Mask.getBSet());
        snr = new SNR(outputImg, saltImg_5);
        System.out.println("salt5_open: " + snr.caculateSNR());
        FileProcess.outputImg(outputImg, "salt5_clean_open.bmp");
        outputImg = grayScaleMorphology.opening(saltImg_10, Mask.getBSet());
        outputImg = grayScaleMorphology.closing(outputImg, Mask.getBSet());
        snr = new SNR(outputImg, saltImg_10);
        System.out.println("salt10_open: " + snr.caculateSNR());
        FileProcess.outputImg(outputImg, "salt10_clean_open.bmp");

        NoiseCleaning noiseCleaning = new NoiseCleaning(gaussionImg_10, 9);
        noiseCleaning.startToClear("gaussion10_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion10_clean_three_rm.bmp", "rm");
        noiseCleaning.setWindowSize(25);
        noiseCleaning.startToClear("gaussion10_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion10_clean_five_rm.bmp", "rm");
        noiseCleaning.setImg(gaussionImg_30);
        noiseCleaning.startToClear("gaussion30_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion30_clean_five_rm.bmp", "rm");
        noiseCleaning.setWindowSize(9);
        noiseCleaning.startToClear("gaussion30_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("gaussion30_clean_three_rm.bmp", "rm");
        noiseCleaning.setImg(saltImg_5);
        noiseCleaning.startToClear("salt5_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("salt5_clean_three_rm.bmp", "rm");
        noiseCleaning.setWindowSize(25);
        noiseCleaning.startToClear("salt5_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("salt5_clean_five_rm.bmp", "rm");
        noiseCleaning.setImg(saltImg_10);
        noiseCleaning.startToClear("salt10_clean_five_orc.bmp", "orc");
        noiseCleaning.startToClear("salt10_clean_five_rm.bmp", "rm");
        noiseCleaning.setWindowSize(9);
        noiseCleaning.startToClear("salt10_clean_three_orc.bmp", "orc");
        noiseCleaning.startToClear("salt10_clean_three_rm.bmp", "rm");

    }
}
