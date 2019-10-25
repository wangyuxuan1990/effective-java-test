package com.wangyuxuan.effectivejava.chapter2.item2.telescopingconstructor;

/**
 * @author wangyuxuan
 * @date 2019/10/24 16:20
 * @description Telescoping constructor pattern(可伸缩构造方法模式) - does not scale well!
 */
public class NutritionFacts {

    /**
     * (mL) required
     */
    private final int servingSize;
    /**
     * (per container) required
     */
    private final int servings;
    /**
     * (per serving) optional
     */
    private final int calories;
    /**
     * (g/serving) optional
     */
    private final int fat;
    /**
     * (mg/serving) optional
     */
    private final int sodium;
    /**
     * (g/serving) optional
     */
    private final int carbohydrate;

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
    }
}
