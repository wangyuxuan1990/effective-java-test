package com.wangyuxuan.effectivejava.chapter2.item6;

import java.util.regex.Pattern;

/**
 * @author wangyuxuan
 * @date 2019/10/28 11:32
 * @description Reusing expensive object for improved performance
 */
public class RomanNumerals {

    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        int numReps = Integer.parseInt(args[1]);
        boolean b = false;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < numReps; j++) {
//                b ^= isRomanNumeralSlow("MCMLXXVI");
                b ^= isRomanNumeralFast("MCMLXXVI");
            }
            long end = System.nanoTime();
            System.out.println((end - start) / (1_000. * numReps) + " μs.");
        }

        if (!b) {
            System.out.println();
        }
    }
}
