package com.wangyuxuan.effectivejava.chapter3.item10.inheritance;

import com.wangyuxuan.effectivejava.chapter3.item10.Point;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wangyuxuan
 * @date 2019/10/29 17:57
 * @description
 */
public class CounterPoint extends Point {

    private static final AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }
}
