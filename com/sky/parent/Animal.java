package com.sky.parent;

import java.util.Objects;

public abstract class Animal {

    private int weight;
    private int height;
    private int age;
    private String type;

    public Animal(int weight, int height, int age) {
        setWeight(weight);
        setHeight(height);
        setAge(age);
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "type= " + type +
                ", weight= " + weight +
                ", height= " + height +
                ", age= " + age +
                '}';
    }

    public void traverse() {
        System.out.println("Override");
    }

    public void sound() {

    }

}
