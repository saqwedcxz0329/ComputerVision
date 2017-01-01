package Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Selab on 2016/12/12.
 */
public class Mask {

    public static List<Point> create3X3Mask() {
        List<Point> maskList = new ArrayList<Point>();
        maskList.add(new Point(0, 0, 1));
        maskList.add(new Point(0, 1, 1));
        maskList.add(new Point(-1, 0, 1));
        maskList.add(new Point(0, -1, 1));
        maskList.add(new Point(1, 0, 1));
        maskList.add(new Point(-1, 1, 1));
        maskList.add(new Point(-1, -1, 1));
        maskList.add(new Point(1, -1, 1));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> create5X5Mask() {
        List<Point> maskList = new ArrayList<>();
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <= 2; j++) {
                maskList.add(new Point(i, j, 1));
            }
        }
        return maskList;
    }

    public static Set<Point> getBSet() {
        Set<Point> bSet = new HashSet<>();
        bSet.add(new Point(-1, -1, 0));
        bSet.add(new Point(-1, 0, 0));
        bSet.add(new Point(-1, 1, 0));
        bSet.add(new Point(0, -2, 0));
        bSet.add(new Point(0, -1, 0));
        bSet.add(new Point(0, 0, 0));
        bSet.add(new Point(0, 1, 0));
        bSet.add(new Point(0, 2, 0));
        bSet.add(new Point(1, -2, 0));
        bSet.add(new Point(1, -1, 0));
        bSet.add(new Point(1, 0, 0));
        bSet.add(new Point(1, 1, 0));
        bSet.add(new Point(1, 2, 0));
        bSet.add(new Point(2, -1, 0));
        bSet.add(new Point(2, 0, 0));
        bSet.add(new Point(2, 1, 0));
        return bSet;
    }

    public static List<Point> getRobertOne() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(0, 0, -1));
        maskList.add(new Point(0, 1, 0));
        maskList.add(new Point(1, 0, 0));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getRobertTwo() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(0, 0, 0));
        maskList.add(new Point(0, 1, -1));
        maskList.add(new Point(1, 0, 1));
        maskList.add(new Point(1, 1, 0));
        return maskList;
    }

    public static List<Point> getPrewittOne() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(-1, 0, -1));
        maskList.add(new Point(-1, 1, -1));
        maskList.add(new Point(1, -1, 1));
        maskList.add(new Point(1, 0, 1));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getPrewittTwo() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(0, -1, -1));
        maskList.add(new Point(1, -1, -1));
        maskList.add(new Point(-1, 1, 1));
        maskList.add(new Point(0, 1, 1));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getSobelOne() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(-1, 0, -2));
        maskList.add(new Point(-1, 1, -1));
        maskList.add(new Point(1, -1, 1));
        maskList.add(new Point(1, 0, 2));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getSobelTwo() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(0, -1, -2));
        maskList.add(new Point(1, -1, -1));
        maskList.add(new Point(-1, 1, 1));
        maskList.add(new Point(0, 1, 2));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getFreiOne() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(-1, 0, -Math.sqrt(2)));
        maskList.add(new Point(-1, 1, -1));
        maskList.add(new Point(1, -1, 1));
        maskList.add(new Point(1, 0, Math.sqrt(2)));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getFreiTwo() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(0, -1, -Math.sqrt(2)));
        maskList.add(new Point(1, -1, -1));
        maskList.add(new Point(-1, 1, 1));
        maskList.add(new Point(0, 1, Math.sqrt(2)));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getKirschZero() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -3));
        maskList.add(new Point(-1, 0, -3));
        maskList.add(new Point(-1, 1, 5));
        maskList.add(new Point(0, 1, 5));
        maskList.add(new Point(1, 1, 5));
        maskList.add(new Point(1, 0, -3));
        maskList.add(new Point(1, -1, -3));
        maskList.add(new Point(0, -1, -3));
        return maskList;
    }

    public static List<Point> getKirschOne() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -3));
        maskList.add(new Point(-1, 0, 5));
        maskList.add(new Point(-1, 1, 5));
        maskList.add(new Point(0, 1, 5));
        maskList.add(new Point(1, 1, -3));
        maskList.add(new Point(1, 0, -3));
        maskList.add(new Point(1, -1, -3));
        maskList.add(new Point(0, -1, -3));
        return maskList;
    }

    public static List<Point> getKirschTwo() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, 5));
        maskList.add(new Point(-1, 0, 5));
        maskList.add(new Point(-1, 1, 5));
        maskList.add(new Point(0, 1, -3));
        maskList.add(new Point(1, 1, -3));
        maskList.add(new Point(1, 0, -3));
        maskList.add(new Point(1, -1, -3));
        maskList.add(new Point(0, -1, -3));
        return maskList;
    }

    public static List<Point> getKirschThree() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, 5));
        maskList.add(new Point(-1, 0, 5));
        maskList.add(new Point(-1, 1, -3));
        maskList.add(new Point(0, 1, -3));
        maskList.add(new Point(1, 1, -3));
        maskList.add(new Point(1, 0, -3));
        maskList.add(new Point(1, -1, -3));
        maskList.add(new Point(0, -1, 5));
        return maskList;
    }

    public static List<Point> getKirschFour() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, 5));
        maskList.add(new Point(-1, 0, -3));
        maskList.add(new Point(-1, 1, -3));
        maskList.add(new Point(0, 1, -3));
        maskList.add(new Point(1, 1, -3));
        maskList.add(new Point(1, 0, -3));
        maskList.add(new Point(1, -1, 5));
        maskList.add(new Point(0, -1, 5));
        return maskList;
    }

    public static List<Point> getKirschFive() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -3));
        maskList.add(new Point(-1, 0, -3));
        maskList.add(new Point(-1, 1, -3));
        maskList.add(new Point(0, 1, -3));
        maskList.add(new Point(1, 1, -3));
        maskList.add(new Point(1, 0, 5));
        maskList.add(new Point(1, -1, 5));
        maskList.add(new Point(0, -1, 5));
        return maskList;
    }

    public static List<Point> getKirschSix() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -3));
        maskList.add(new Point(-1, 0, -3));
        maskList.add(new Point(-1, 1, -3));
        maskList.add(new Point(0, 1, -3));
        maskList.add(new Point(1, 1, 5));
        maskList.add(new Point(1, 0, 5));
        maskList.add(new Point(1, -1, 5));
        maskList.add(new Point(0, -1, -3));
        return maskList;
    }

    public static List<Point> getKirschSeven() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -3));
        maskList.add(new Point(-1, 0, -3));
        maskList.add(new Point(-1, 1, -3));
        maskList.add(new Point(0, 1, 5));
        maskList.add(new Point(1, 1, 5));
        maskList.add(new Point(1, 0, 5));
        maskList.add(new Point(1, -1, -3));
        maskList.add(new Point(0, -1, -3));
        return maskList;
    }

    public static List<Point> getRobinsonZero() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(0, -1, -2));
        maskList.add(new Point(1, -1, -1));
        maskList.add(new Point(-1, 1, 1));
        maskList.add(new Point(0, 1, 2));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getRobinsonFour() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, 1));
        maskList.add(new Point(0, -1, 2));
        maskList.add(new Point(1, -1, 1));
        maskList.add(new Point(-1, 1, -1));
        maskList.add(new Point(0, 1, -2));
        maskList.add(new Point(1, 1, -1));
        return maskList;
    }

    public static List<Point> getRobinsonOne() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, 0, 1));
        maskList.add(new Point(-1, 1, 2));
        maskList.add(new Point(0, 1, 1));
        maskList.add(new Point(1, 0, -1));
        maskList.add(new Point(1, -1, -2));
        maskList.add(new Point(0, -1, -1));
        return maskList;
    }

    public static List<Point> getRobinsonFive() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, 0, -1));
        maskList.add(new Point(-1, 1, -2));
        maskList.add(new Point(0, 1, -1));
        maskList.add(new Point(1, 0, 1));
        maskList.add(new Point(1, -1, 2));
        maskList.add(new Point(0, -1, 1));
        return maskList;
    }

    public static List<Point> getRobinsonTwo() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, 1));
        maskList.add(new Point(-1, 0, 2));
        maskList.add(new Point(-1, 1, 1));
        maskList.add(new Point(1, -1, -1));
        maskList.add(new Point(1, 0, -2));
        maskList.add(new Point(1, 1, -1));
        return maskList;
    }

    public static List<Point> getRobinsonSix() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, -1));
        maskList.add(new Point(-1, 0, -2));
        maskList.add(new Point(-1, 1, -1));
        maskList.add(new Point(1, -1, 1));
        maskList.add(new Point(1, 0, 2));
        maskList.add(new Point(1, 1, 1));
        return maskList;
    }

    public static List<Point> getRobinsonThree() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(0, -1, 1));
        maskList.add(new Point(-1, -1, 2));
        maskList.add(new Point(-1, 0, 1));
        maskList.add(new Point(0, 1, -1));
        maskList.add(new Point(1, 1, -2));
        maskList.add(new Point(1, 0, -1));
        return maskList;
    }

    public static List<Point> getRobinsonSeven() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(0, -1, -1));
        maskList.add(new Point(-1, -1, -2));
        maskList.add(new Point(-1, 0, -1));
        maskList.add(new Point(0, 1, 1));
        maskList.add(new Point(1, 1, 2));
        maskList.add(new Point(1, 0, 1));
        return maskList;
    }

    public static List<Point> getNevatiaZero() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-2, -2, 100));
        maskList.add(new Point(-2, -1, 100));
        maskList.add(new Point(-2, 0, 100));
        maskList.add(new Point(-2, 1, 100));
        maskList.add(new Point(-2, 2, 100));

        maskList.add(new Point(-1, -2, 100));
        maskList.add(new Point(-1, -1, 100));
        maskList.add(new Point(-1, 0, 100));
        maskList.add(new Point(-1, 1, 100));
        maskList.add(new Point(-1, 2, 100));

        maskList.add(new Point(1, -2, -100));
        maskList.add(new Point(1, -1, -100));
        maskList.add(new Point(1, 0, -100));
        maskList.add(new Point(1, 1, -100));
        maskList.add(new Point(1, 2, -100));

        maskList.add(new Point(2, -2, -100));
        maskList.add(new Point(2, -1, -100));
        maskList.add(new Point(2, 0, -100));
        maskList.add(new Point(2, 1, -100));
        maskList.add(new Point(2, 2, -100));
        return maskList;
    }

    public static List<Point> getNevatiaThirty() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-2, -2, 100));
        maskList.add(new Point(-2, -1, 100));
        maskList.add(new Point(-2, 0, 100));
        maskList.add(new Point(-2, 1, 100));
        maskList.add(new Point(-2, 2, 100));

        maskList.add(new Point(-1, -2, 100));
        maskList.add(new Point(-1, -1, 100));
        maskList.add(new Point(-1, 0, 100));
        maskList.add(new Point(-1, 1, 78));
        maskList.add(new Point(-1, 2, -32));

        maskList.add(new Point(1, -2, 32));
        maskList.add(new Point(1, -1, -78));
        maskList.add(new Point(1, 0, -100));
        maskList.add(new Point(1, 1, -100));
        maskList.add(new Point(1, 2, -100));

        maskList.add(new Point(2, -2, -100));
        maskList.add(new Point(2, -1, -100));
        maskList.add(new Point(2, 0, -100));
        maskList.add(new Point(2, 1, -100));
        maskList.add(new Point(2, 2, -100));

        maskList.add(new Point(0, -2, 100));
        maskList.add(new Point(0, -1, 92));
        maskList.add(new Point(0, 1, -92));
        maskList.add(new Point(0, 2, -100));
        return maskList;
    }

    public static List<Point> getNevatiaSixty() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-2, -2, 100));
        maskList.add(new Point(-2, -1, 100));
        maskList.add(new Point(-2, 0, 100));
        maskList.add(new Point(-2, 1, 32));
        maskList.add(new Point(-2, 2, -100));

        maskList.add(new Point(-1, -2, 100));
        maskList.add(new Point(-1, -1, 100));
        maskList.add(new Point(-1, 0, 92));
        maskList.add(new Point(-1, 1, -78));
        maskList.add(new Point(-1, 2, -100));

        maskList.add(new Point(1, -2, 100));
        maskList.add(new Point(1, -1, 78));
        maskList.add(new Point(1, 0, -92));
        maskList.add(new Point(1, 1, -100));
        maskList.add(new Point(1, 2, -100));

        maskList.add(new Point(2, -2, 100));
        maskList.add(new Point(2, -1, -32));
        maskList.add(new Point(2, 0, -100));
        maskList.add(new Point(2, 1, -100));
        maskList.add(new Point(2, 2, -100));

        maskList.add(new Point(0, -2, 100));
        maskList.add(new Point(0, -1, 100));
        maskList.add(new Point(0, 1, -100));
        maskList.add(new Point(0, 2, -100));
        return maskList;
    }

    public static List<Point> getNevatiaNegativeSixty() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-2, -2, -100));
        maskList.add(new Point(-2, -1, 32));
        maskList.add(new Point(-2, 0, 100));
        maskList.add(new Point(-2, 1, 100));
        maskList.add(new Point(-2, 2, 100));

        maskList.add(new Point(-1, -2, -100));
        maskList.add(new Point(-1, -1, -78));
        maskList.add(new Point(-1, 0, 92));
        maskList.add(new Point(-1, 1, 100));
        maskList.add(new Point(-1, 2, 100));

        maskList.add(new Point(1, -2, -100));
        maskList.add(new Point(1, -1, -100));
        maskList.add(new Point(1, 0, -92));
        maskList.add(new Point(1, 1, 78));
        maskList.add(new Point(1, 2, 100));

        maskList.add(new Point(2, -2, -100));
        maskList.add(new Point(2, -1, -100));
        maskList.add(new Point(2, 0, -100));
        maskList.add(new Point(2, 1, -32));
        maskList.add(new Point(2, 2, 100));

        maskList.add(new Point(0, -2, -100));
        maskList.add(new Point(0, -1, -100));
        maskList.add(new Point(0, 1, 100));
        maskList.add(new Point(0, 2, 100));
        return maskList;
    }

    public static List<Point> getNevatiaNegativeNinety() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-2, -2, -100));
        maskList.add(new Point(-2, -1, -100));
        maskList.add(new Point(-2, 1, 100));
        maskList.add(new Point(-2, 2, 100));

        maskList.add(new Point(-1, -2, -100));
        maskList.add(new Point(-1, -1, -100));
        maskList.add(new Point(-1, 1, 100));
        maskList.add(new Point(-1, 2, 100));

        maskList.add(new Point(1, -2, -100));
        maskList.add(new Point(1, -1, -100));
        maskList.add(new Point(1, 1, 100));
        maskList.add(new Point(1, 2, 100));

        maskList.add(new Point(2, -2, -100));
        maskList.add(new Point(2, -1, -100));
        maskList.add(new Point(2, 1, 100));
        maskList.add(new Point(2, 2, 100));

        maskList.add(new Point(0, -2, -100));
        maskList.add(new Point(0, -1, -100));
        maskList.add(new Point(0, 1, 100));
        maskList.add(new Point(0, 2, 100));
        return maskList;
    }

    public static List<Point> getNevatiaNegativeThirty() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-2, -2, 100));
        maskList.add(new Point(-2, -1, 100));
        maskList.add(new Point(-2, 0, 100));
        maskList.add(new Point(-2, 1, 100));
        maskList.add(new Point(-2, 2, 100));

        maskList.add(new Point(-1, -2, -32));
        maskList.add(new Point(-1, -1, 78));
        maskList.add(new Point(-1, 0, 100));
        maskList.add(new Point(-1, 1, 100));
        maskList.add(new Point(-1, 2, 100));

        maskList.add(new Point(1, -2, -100));
        maskList.add(new Point(1, -1, -100));
        maskList.add(new Point(1, 0, -100));
        maskList.add(new Point(1, 1, -78));
        maskList.add(new Point(1, 2, 32));

        maskList.add(new Point(2, -2, -100));
        maskList.add(new Point(2, -1, -100));
        maskList.add(new Point(2, 0, -100));
        maskList.add(new Point(2, 1, -100));
        maskList.add(new Point(2, 2, -100));

        maskList.add(new Point(0, -2, -100));
        maskList.add(new Point(0, -1, -92));
        maskList.add(new Point(0, 1, 92));
        maskList.add(new Point(0, 2, 100));
        return maskList;
    }

    public static List<Point> getLaplacian() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, 0, 1));
        maskList.add(new Point(0, -1, 1));
        maskList.add(new Point(0, 1, 1));
        maskList.add(new Point(1, 0, 1));
        maskList.add(new Point(0, 0, -4));
        return maskList;
    }

    public static List<Point> getMinimunVarianceLaplacian() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-1, -1, 2.0 / 3.0));
        maskList.add(new Point(-1, 1, 2.0 / 3.0));
        maskList.add(new Point(1, -1, 2.0 / 3.0));
        maskList.add(new Point(1, 1, 2.0 / 3.0));
        maskList.add(new Point(-1, 0, -1.0 / 3.0));
        maskList.add(new Point(0, -1, -1.0 / 3.0));
        maskList.add(new Point(0, 1, -1.0 / 3.0));
        maskList.add(new Point(1, 0, -1.0 / 3.0));
        maskList.add(new Point(0, 0, -4.0 / 3.0));
        return maskList;
    }

    public static List<Point> getLOG() {
        List<Point> maskList = new ArrayList<>();
        maskList.add(new Point(-5, -2, -1));
        maskList.add(new Point(-5, -1, -1));
        maskList.add(new Point(-5, 0, -2));
        maskList.add(new Point(-5, 1, -1));
        maskList.add(new Point(-5, 2, -1));

        maskList.add(new Point(5, -2, -1));
        maskList.add(new Point(5, -1, -1));
        maskList.add(new Point(5, 0, -2));
        maskList.add(new Point(5, 1, -1));
        maskList.add(new Point(5, 2, -1));

        maskList.add(new Point(-4, -3, -2));
        maskList.add(new Point(-4, -2, -4));
        maskList.add(new Point(-4, -1, -8));
        maskList.add(new Point(-4, 0, -9));
        maskList.add(new Point(-4, 1, -8));
        maskList.add(new Point(-4, 2, -4));
        maskList.add(new Point(-4, 3, -2));

        maskList.add(new Point(4, -3, -2));
        maskList.add(new Point(4, -2, -4));
        maskList.add(new Point(4, -1, -8));
        maskList.add(new Point(4, 0, -9));
        maskList.add(new Point(4, 1, -8));
        maskList.add(new Point(4, 2, -4));
        maskList.add(new Point(4, 3, -2));

        maskList.add(new Point(-3, -4, -2));
        maskList.add(new Point(-3, 4, -2));
        maskList.add(new Point(-3, -3, -7));
        maskList.add(new Point(-3, 3, -7));
        maskList.add(new Point(-3, -2, -15));
        maskList.add(new Point(-3, 2, -15));
        maskList.add(new Point(-3, -1, -22));
        maskList.add(new Point(-3, 1, -22));
        maskList.add(new Point(-3, 0, -23));

        maskList.add(new Point(3, -4, -2));
        maskList.add(new Point(3, 4, -2));
        maskList.add(new Point(3, -3, -7));
        maskList.add(new Point(3, 3, -7));
        maskList.add(new Point(3, -2, -15));
        maskList.add(new Point(3, 2, -15));
        maskList.add(new Point(3, -1, -22));
        maskList.add(new Point(3, 1, -22));
        maskList.add(new Point(3, 0, -23));

        maskList.add(new Point(-2, -5, -1));
        maskList.add(new Point(-2, 5, -1));
        maskList.add(new Point(-2, -4, -4));
        maskList.add(new Point(-2, 4, -4));
        maskList.add(new Point(-2, -3, -15));
        maskList.add(new Point(-2, 3, -15));
        maskList.add(new Point(-2, -2, -24));
        maskList.add(new Point(-2, 2, -24));
        maskList.add(new Point(-2, -1, -14));
        maskList.add(new Point(-2, 1, -14));
        maskList.add(new Point(-2, 0, -1));

        maskList.add(new Point(2, -5, -1));
        maskList.add(new Point(2, 5, -1));
        maskList.add(new Point(2, -4, -4));
        maskList.add(new Point(2, 4, -4));
        maskList.add(new Point(2, -3, -15));
        maskList.add(new Point(2, 3, -15));
        maskList.add(new Point(2, -2, -24));
        maskList.add(new Point(2, 2, -24));
        maskList.add(new Point(2, -1, -14));
        maskList.add(new Point(2, 1, -14));
        maskList.add(new Point(2, 0, -1));

        maskList.add(new Point(-1, -5, -1));
        maskList.add(new Point(-1, 5, -1));
        maskList.add(new Point(-1, -4, -8));
        maskList.add(new Point(-1, 4, -8));
        maskList.add(new Point(-1, -3, -22));
        maskList.add(new Point(-1, 3, -22));
        maskList.add(new Point(-1, -2, -14));
        maskList.add(new Point(-1, 2, -14));
        maskList.add(new Point(-1, -1, 52));
        maskList.add(new Point(-1, 1, 52));
        maskList.add(new Point(-1, 0, 103));

        maskList.add(new Point(1, -5, -1));
        maskList.add(new Point(1, 5, -1));
        maskList.add(new Point(1, -4, -8));
        maskList.add(new Point(1, 4, -8));
        maskList.add(new Point(1, -3, -22));
        maskList.add(new Point(1, 3, -22));
        maskList.add(new Point(1, -2, -14));
        maskList.add(new Point(1, 2, -14));
        maskList.add(new Point(1, -1, 52));
        maskList.add(new Point(1, 1, 52));
        maskList.add(new Point(1, 0, 103));

        maskList.add(new Point(0, -5, -2));
        maskList.add(new Point(0, 5, -2));
        maskList.add(new Point(0, -4, -9));
        maskList.add(new Point(0, 4, -9));
        maskList.add(new Point(0, -3, -23));
        maskList.add(new Point(0, 3, -23));
        maskList.add(new Point(0, -2, -1));
        maskList.add(new Point(0, 2, -1));
        maskList.add(new Point(0, -1, 103));
        maskList.add(new Point(0, 1, 103));
        maskList.add(new Point(0, 0, 178));

        return maskList;
    }

    public static List<Point> getDOG() {
        List<Point> maskList = new ArrayList<>();
        for (int i = -5; i <= 5; i++) {
            for (int j = -5; j <= 5; j++) {
//                double g = gaussion(i,j, 3, 1);
                double g1 = gaussion(i, j, 1);
                double g2 = gaussion(i, j, 3);
                double g = g1 - g2;
                maskList.add(new Point(i, j, g));
            }
        }
        return maskList;
    }

    private static double gaussion(int x, int y, int sigma) {
        double a1 = Math.exp(((x * x) + (y * y)) / (-2 * sigma * sigma));
//        double a2 = (Math.sqrt(2 * Math.PI * sigma * sigma));
        double a2 = 2 * Math.PI * sigma * sigma;
        return a1 / a2;
    }

    private static double gaussion(int x, int y, int sigma1, int sigma2) {
        double a1 = Math.exp(((x * x) + (y * y)) / (-2 * sigma1 * sigma1)) / sigma1;
        double b1 = Math.exp(((x * x) + (y * y)) / (-2 * sigma2 * sigma2)) / sigma2;
        double z = (Math.sqrt(2 * Math.PI));
        return (a1 - b1) / z;
    }
}
