package com.wangyuxuan.effectivejava.chapter2.item3.staticfactory;

/**
 * @author wangyuxuan
 * @date 2019/10/25 15:47
 * @description Singleton with static factory
 */
public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("say something");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }
}
