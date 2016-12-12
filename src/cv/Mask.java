package cv;

import java.util.ArrayList;
import java.util.List;

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
}
