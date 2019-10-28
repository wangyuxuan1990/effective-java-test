package com.wangyuxuan.effectivejava.chapter2.item6;

/**
 * @author wangyuxuan
 * @date 2019/10/28 13:42
 * @description Hideously slow! Can you spot the object creation?
 */
public class Sum {

    private static long sum() {
//        Long sum = 0L;
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        long x = 0;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            x += sum();
            long end = System.nanoTime();
            System.out.println((end - start) / 1_000_000. + " ms.");
        }

        if (x == 42) {
            System.out.println();
        }

    }
}
