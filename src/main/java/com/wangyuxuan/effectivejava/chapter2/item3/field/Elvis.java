package com.wangyuxuan.effectivejava.chapter2.item3.field;

/**
 * @author wangyuxuan
 * @date 2019/10/25 15:42
 * @description Singleton with public final field
 */
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("say something");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }
}
