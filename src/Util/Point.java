package Util;

/**
 * Created by Selab on 2016/12/12.
 */
public class Point {
    private int x, y;
    private double value;

    public Point(int x, int y, double value){
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
