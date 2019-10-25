package com.wangyuxuan.effectivejava.chapter2.item4;

/**
 * @author wangyuxuan
 * @date 2019/10/25 16:43
 * @description Noninstantiable utility class
 */
public class UtilityClass {

    /**
     * Suppress default constructor for noninstantiability
     */
    private UtilityClass() {
        throw new AssertionError();
    }
}
