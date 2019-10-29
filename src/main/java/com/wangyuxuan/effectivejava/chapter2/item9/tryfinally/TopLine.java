package com.wangyuxuan.effectivejava.chapter2.item9.tryfinally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wangyuxuan
 * @date 2019/10/29 10:19
 * @description try-finally - No longer the best way to close resources!
 */
public class TopLine {

    static String firstLineOfFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfFile(path));
    }
}
