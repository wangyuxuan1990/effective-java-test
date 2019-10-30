package com.wangyuxuan.effectivejava.chapter3.item10.composition;

import com.wangyuxuan.effectivejava.chapter3.item10.Color;
import com.wangyuxuan.effectivejava.chapter3.item10.Point;

import java.util.Objects;

/**
 * @author wangyuxuan
 * @date 2019/10/30 9:38
 * @description
 */
public class ColorPoint {

    private final Point point;

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint cp = (ColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }

    @Override
    public int hashCode() {
        return 31 * point.hashCode() + color.hashCode();
    }
}
