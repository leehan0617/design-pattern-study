package com.pattern.design.builder;

/**
 *  Builder Pattern
 *
 *  객체 생성하는 패턴중에 하나.
 *
 *  장점 : 유연한 매개변수를 설정
 *        가독성 향상 (메소드명을 읽기 쉽게 변형도 함)
 *        불변객체를 만들때 유리(set메소드를 만들지 말아야할때)
 *  단점 : 매 객체마다 Builder 클래스를 만들어야함 (lombok 으로 극복가능)
 *        객체 자체의 스펙변경(매개변수 추가 or 삭제)가 일어날 때, Builder 클래스도 수정을 해야 함
 *        매개변수가 적은 객체일떄는 필요가 없음.(많을 때 사용하는것이 유리)
 *        성능이 중요한 프로그램에서는 문제가 될 수 있음(매번 static class를 생성)
 */
public class Snack {
    private String name;
    private int price;
    private String brand;
    private int calories;
    private int fat;

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getFat() {
        return this.fat;
    }

    public static class Builder {
        private String name;
        private int price;
        private String brand;
        private int calories;
        private int fat;

        public Builder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Snack build() {
            return new Snack(this);
        }
    }

    private Snack(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.brand = builder.brand;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }
}
