package com.wangyuxuan.effectivejava.chapter4.item17;

/**
 * @author wangyuxuan
 * @date 2019/11/12 15:10
 * @description Immutable complex number class
 */
public final class Complex {

    private final double re;
    private final double im;

    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1, 0);
    public static final Complex I = new Complex(0, 1);

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double realPart() {
        return re;
    }

    public double imaginaryPart() {
        return im;
    }

    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp, (im * c.re - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Complex)) {
            return false;
        }

        Complex c = (Complex) obj;

        /**
         * 对于float 基本类型的属性，使用静态Float.compare(float, float) 方法；对于double
         * 基本类型的属性，使用Double.compare(double, double) 方法。由于存在Float.NaN，-0.0f 和类
         * 似的double 类型的值，所以需要对float 和double 属性进行特殊的处理；
         */
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}
