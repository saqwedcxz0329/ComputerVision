package hw8;

/**
 * Created by Selab on 2016/12/12.
 */
public abstract class Clean {
    protected int[][] inputImg;
    protected int windowHeight, windowWidth;

    public Clean(int[][] inputImg, int windowHeight, int windowWidth){
        this.inputImg = inputImg;
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
    }
    public abstract int[][] clearNoise();
}
