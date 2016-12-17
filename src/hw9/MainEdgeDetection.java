package hw9;

import Util.FileProcess;
import Util.ImageProcess;
import Util.Mask;
import Util.Point;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Louis on 2016/12/17.
 */
public class MainEdgeDetection {
    public static void main(String[] args) throws IOException {
        int[][] img = FileProcess.inputImg(new File("lena.bmp"));
        int[][] outputImg = null;
        List<List<Point>> maskList = new ArrayList<>();

        System.out.println("Doing Robert edge detection...");
        maskList.add(Mask.getRobertOne());
        maskList.add(Mask.getRobertTwo());
        outputImg =  EdgeDetection.operator(img, maskList, "one");
        outputImg = ImageProcess.binaryImage(outputImg, 25);
        FileProcess.outputImg(outputImg, "robert.bmp");

        System.out.println("Doing Prewitt edge detection...");
        maskList = new ArrayList<>();
        maskList.add(Mask.getPrewittOne());
        maskList.add(Mask.getPrewittTwo());
        outputImg =  EdgeDetection.operator(img, maskList, "one");
        outputImg = ImageProcess.binaryImage(outputImg, 75);
        FileProcess.outputImg(outputImg, "prewitt.bmp");

        System.out.println("Doing Sobel edge detection...");
        maskList = new ArrayList<>();
        maskList.add(Mask.getSobelOne());
        maskList.add(Mask.getSobelTwo());
        outputImg =  EdgeDetection.operator(img, maskList, "one");
        outputImg = ImageProcess.binaryImage(outputImg, 125);
        FileProcess.outputImg(outputImg, "sobel.bmp");

        System.out.println("Doing Frei adn Chen edge detection...");
        maskList = new ArrayList<>();
        maskList.add(Mask.getFreiOne());
        maskList.add(Mask.getFreiTwo());
        outputImg =  EdgeDetection.operator(img, maskList, "one");
        outputImg = ImageProcess.binaryImage(outputImg, 125);
        FileProcess.outputImg(outputImg, "frei.bmp");

        System.out.println("Doing Kirsch edge detection...");
        maskList = new ArrayList<>();
        maskList.add(Mask.getKirschZero());
        maskList.add(Mask.getKirschOne());
        maskList.add(Mask.getKirschTwo());
        maskList.add(Mask.getKirschThree());
        maskList.add(Mask.getKirschFour());
        maskList.add(Mask.getKirschFive());
        maskList.add(Mask.getKirschSix());
        maskList.add(Mask.getKirschSeven());
        outputImg =  EdgeDetection.operator(img, maskList, "two");
        outputImg = ImageProcess.binaryImage(outputImg, 500);
        FileProcess.outputImg(outputImg, "kirch.bmp");

        System.out.println("Doing Robinsion edge detection...");
        maskList = new ArrayList<>();
        maskList.add(Mask.getRobinsonZero());
        maskList.add(Mask.getRobinsonOne());
        maskList.add(Mask.getRobinsonTwo());
        maskList.add(Mask.getRobinsonThree());
        maskList.add(Mask.getRobinsonFour());
        maskList.add(Mask.getRobinsonFive());
        maskList.add(Mask.getRobinsonSix());
        maskList.add(Mask.getRobinsonSeven());
        outputImg =  EdgeDetection.operator(img, maskList, "two");
        outputImg = ImageProcess.binaryImage(outputImg, 100);
        FileProcess.outputImg(outputImg, "robinson.bmp");

        System.out.println("Doing Nevatia edge detection...");
        maskList = new ArrayList<>();
        maskList.add(Mask.getNevatiaZero());
        maskList.add(Mask.getNevatiaThirty());
        maskList.add(Mask.getNevatiaNegativeThirty());
        maskList.add(Mask.getNevatiaSixty());
        maskList.add(Mask.getNevatiaNegativeSixty());
        maskList.add(Mask.getNevatiaNegativeNinety());
        outputImg =  EdgeDetection.operator(img, maskList, "two");
        outputImg = ImageProcess.binaryImage(outputImg, 20000);
        FileProcess.outputImg(outputImg, "nevatia.bmp");
    }
}
