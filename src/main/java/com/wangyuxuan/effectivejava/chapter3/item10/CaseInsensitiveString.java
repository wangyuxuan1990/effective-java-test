package com.wangyuxuan.effectivejava.chapter3.item10;

import java.util.Objects;

/**
 * @author wangyuxuan
 * @date 2019/10/29 16:48
 * @description 对称性
 */
public final class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = Objects.requireNonNull(s);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof CaseInsensitiveString) {
//            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
//        }
//
//        if (obj instanceof String) {
//            return s.equalsIgnoreCase((String) obj);
//        }
//
//        return false;
//    }


    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString) obj).s.equalsIgnoreCase(s);
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "Polish";
        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));
    }
}
