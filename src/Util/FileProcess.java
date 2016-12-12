package Util;

import sun.java2d.pipe.BufferedTextPipe;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by Selab on 2016/12/11.
 */
public class FileProcess {

    public static int[][] inputImg(File file) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(file);
        BufferedImage argbImg = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        argbImg.getGraphics().drawImage(bufferedImage, 0, 0, null);
//        System.out.println(argbImg.getHeight() + "  " + argbImg.getWidth());
//        System.out.println(argbImg.getRGB(4927, 3263));
        return convertToGrayImg(argbImg);
    }

    public static void outputImg(int[][] outputArray, String fileName) throws IOException {
        BufferedImage outputImgBuffer = covertToBufferedImage(outputArray);
        ImageIO.write(outputImgBuffer, "bmp", new File(fileName));
    }

    public static void outPutFile(int[][] connectivityNumber, String fileName) throws IOException {
        File connectivity_file = new File(fileName);
        BufferedWriter fw = null;
        fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(connectivity_file, true), "UTF-8"));
        for (int i = 0; i < connectivityNumber.length; i++) {
            for (int j = 0; j < connectivityNumber[0].length; j++) {
                fw.append(String.valueOf(connectivityNumber[i][j]));
            }
            fw.newLine();
        }
        fw.flush();
        fw.close();
    }

    public static int[][] convertToGrayImg(BufferedImage bi) {
        int height = bi.getHeight();
        int width = bi.getWidth();
        int[][] processImg = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int rgb = bi.getRGB(j, i);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb & 0xFF);
                processImg[i][j] = (r + g + b) / 3;
            }
        }
        return processImg;
    }

    private static BufferedImage covertToBufferedImage(int[][] processImg) {
        int height = processImg.length;
        int width = processImg[0].length;
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int value = processImg[i][j];
                value = value << 16 | value << 8 | value;
                bi.setRGB(j, i, value);
            }
        }
        return bi;
    }

}
