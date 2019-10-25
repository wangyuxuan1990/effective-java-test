package com.wangyuxuan.effectivejava.chapter2.item3.enumtype;

/**
 * @author wangyuxuan
 * @date 2019/10/25 15:53
 * @description Enum singleton - the preferred approach
 */
public enum Elvis {

    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("say something");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
