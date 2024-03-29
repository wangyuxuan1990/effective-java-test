package com.wangyuxuan.effectivejava.chapter4.item19;

import java.time.Instant;

/**
 * @author wangyuxuan
 * @date 2019/11/25 17:38
 * @description
 */
public class Sub extends Super {

    /**
     * Blank final, set by constructor
     */
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    /**
     * Overriding method invoked by superclass constructor
     */
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
