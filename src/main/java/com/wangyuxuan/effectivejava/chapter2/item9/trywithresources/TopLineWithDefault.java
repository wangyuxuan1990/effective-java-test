package com.wangyuxuan.effectivejava.chapter2.item9.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wangyuxuan
 * @date 2019/10/29 10:59
 * @description try-with-resources with a catch clause
 */
public class TopLineWithDefault {

    static String firstLineOfFile(String path, String defaultVal) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }

    public static void main(String[] args) throws IOException {
        String path = args[0];
        System.out.println(firstLineOfFile(path, "Toppy McTopFace"));
    }
}
