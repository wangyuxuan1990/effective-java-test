package com.wangyuxuan.effectivejava.chapter4.item16;

/**
 * @author wangyuxuan
 * @date 2019/11/11 15:13
 * @description
 */
class Point {

//    public double x;
//    public double y;

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
