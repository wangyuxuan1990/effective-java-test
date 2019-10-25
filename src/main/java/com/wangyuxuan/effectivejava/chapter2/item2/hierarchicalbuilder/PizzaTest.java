package com.wangyuxuan.effectivejava.chapter2.item2.hierarchicalbuilder;

import static com.wangyuxuan.effectivejava.chapter2.item2.hierarchicalbuilder.NyPizza.Size.SMALL;
import static com.wangyuxuan.effectivejava.chapter2.item2.hierarchicalbuilder.Pizza.Topping.*;

/**
 * @author wangyuxuan
 * @date 2019/10/25 14:32
 * @description Using the hierarchical builder
 */
public class PizzaTest {

    public static void main(String[] args) {

        NyPizza nyPizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println(nyPizza);
        System.out.println(calzone);
    }
}
