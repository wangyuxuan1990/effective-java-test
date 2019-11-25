package com.wangyuxuan.effectivejava.chapter4.item19;

/**
 * @author wangyuxuan
 * @date 2019/11/25 17:36
 * @description Class whose constructor invokes an overridable method. NEVER DO THIS!
 */
public class Super {

    /**
     * Broken - constructor invokes an overridable method
     */
    public Super() {
        overrideMe();
    }

    public void overrideMe() {

    }
}
