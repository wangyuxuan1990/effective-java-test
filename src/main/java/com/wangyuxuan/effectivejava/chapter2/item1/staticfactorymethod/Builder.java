package com.wangyuxuan.effectivejava.chapter2.item1.staticfactorymethod;

/**
 * @author wangyuxuan
 * @date 2019/10/24 14:20
 * @description static factory method
 */
public class Builder {

    private String str1;

    private Integer num1;

    private static final Builder INSTANCE = new Builder();

    private Builder() {
    }

    public Builder(String str1, Integer num1) {
        this.str1 = str1;
        this.num1 = num1;
    }

    public Builder(Integer num1, String str1) {
        this.num1 = num1;
        this.str1 = str1;
    }

    public static Builder valueOfStrAndNum(String str1, Integer num1) {
        return new Builder(str1, num1);
    }

    public static Builder valueOfNumAndStr(Integer num1, String str1) {
        return new Builder(num1, str1);
    }

    public static Builder valueOf() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Builder builder1 = Builder.valueOfStrAndNum("builder1", 1);
        Builder builder2 = Builder.valueOfNumAndStr(2, "builder2");
        Builder builder3 = Builder.valueOf();
    }
}
