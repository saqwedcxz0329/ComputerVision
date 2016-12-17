package hw8;

/**
 * Created by Louis on 2016/12/12.
 */
public class SNR {
    int[][] inputImg;
    int[][] noiseImg;
    public SNR(int[][] inputImg, int[][] noiseImg){
        this.inputImg = inputImg;
        this.noiseImg = noiseImg;
    }

    public double caculateSNR(){
        float vs = VS();
        float vn = VN();
        return 10 * Math.log10((vs/vn));
    }

    private float VS(){
        int height = inputImg.length;
        int width = inputImg[0].length;
        float sum = 0;
        float mu = muS();
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                sum = sum + (inputImg[i][j] - mu) * (inputImg[i][j] - mu);
            }
        }
        return sum / (height * width);
    }
    private float muS(){
        int height = inputImg.length;
        int width = inputImg[0].length;
        int sum = 0;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                sum += inputImg[i][j];
            }
        }
        return sum / (height * width);
    }

    private float VN(){
        int height = inputImg.length;
        int width = inputImg[0].length;
        float sum = 0;
        float mu = muNoise();
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                sum = sum + (noiseImg[i][j] - inputImg[i][j] - mu) * (noiseImg[i][j] - inputImg[i][j] - mu);
            }
        }
        return sum / (height * width);
    }

    private float muNoise(){
        int height = inputImg.length;
        int width = inputImg[0].length;
        int sum = 0;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                sum = sum + (noiseImg[i][j] -inputImg[i][j]);
            }
        }
        return sum / (height * width);
    }

}
