package com.wangyuxuan.effectivejava.chapter3.item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wangyuxuan
 * @date 2019/10/30 17:01
 * @description
 */
public class WordList {

    public static void main(String[] args) {
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);
        System.out.println(s);
    }
}
