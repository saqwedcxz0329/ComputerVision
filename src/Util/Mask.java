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
}
