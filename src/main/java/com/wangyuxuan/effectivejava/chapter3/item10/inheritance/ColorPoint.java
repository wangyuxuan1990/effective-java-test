package com.wangyuxuan.effectivejava.chapter3.item10.inheritance;

import com.wangyuxuan.effectivejava.chapter3.item10.Color;
import com.wangyuxuan.effectivejava.chapter3.item10.Point;

/**
 * @author wangyuxuan
 * @date 2019/10/29 17:08
 * @description 对称性、传递性
 */
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof ColorPoint)) {
//            return false;
//        }
//        return super.equals(obj) && ((ColorPoint) obj).color == color;
//    }


    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        if (!(obj instanceof ColorPoint)) {
            return obj.equals(this);
        }

        return super.equals(obj) && ((ColorPoint) obj).color == color;
    }

    public static void main(String[] args) {
//        Point p = new Point(1, 2);
//        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
//        System.out.println(p.equals(cp) + " " + cp.equals(p));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.printf("%s %s %s%n", p1.equals(p2), p2.equals(p3), p1.equals(p3));
    }
}
