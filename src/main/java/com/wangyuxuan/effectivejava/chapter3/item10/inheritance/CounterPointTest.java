package com.wangyuxuan.effectivejava.chapter3.item10.inheritance;

import com.wangyuxuan.effectivejava.chapter3.item10.Point;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangyuxuan
 * @date 2019/10/29 17:38
 * @description
 */
public class CounterPointTest {

    /**
     * 匿名内部类 + 实例初始化块
     */
    private static final Set<Point> unitCircle = new HashSet<Point>() {
        {
            add(new Point(1, 0));
            add(new Point(0, 1));
            add(new Point(-1, 0));
            add(new Point(0, -1));
        }
    };

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 0);
        Point p2 = new CounterPoint(1, 0);

        System.out.println(onUnitCircle(p1));

        System.out.println(onUnitCircle(p2));
    }
}
