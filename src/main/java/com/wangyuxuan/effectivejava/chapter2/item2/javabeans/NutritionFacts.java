package com.wangyuxuan.effectivejava.chapter2.item2.javabeans;

/**
 * @author wangyuxuan
 * @date 2019/10/24 16:39
 * @description JavaBeans Pattern(JavaBeans 模式) - allows inconsistency, mandates mutability
 */
public class NutritionFacts {

    /**
     * (mL) required
     */
    private int servingSize = -1;
    /**
     * (per container) required
     */
    private int servings = -1;
    /**
     * (per serving) optional
     */
    private int calories = 0;
    /**
     * (g/serving) optional
     */
    private int fat = 0;
    /**
     * (mg/serving) optional
     */
    private int sodium = 0;
    /**
     * (g/serving) optional
     */
    private int carbohydrate = 0;

    public NutritionFacts() {
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
