package com.wangyuxuan.effectivejava.chapter2.item2.builder;

/**
 * @author wangyuxuan
 * @date 2019/10/24 16:53
 * @description Builder Pattern(Builder 模式)
 */
public class NutritionFacts {

    private final int servingSize;

    private final int servings;

    private final int calories;

    private final int fat;

    private final int sodium;

    private final int carbohydrate;

    public static class Builder {

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

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}
