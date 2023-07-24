package com.sky.species;

import com.sky.parent.Animal;

public class Mammals extends Animal {

    public Mammals(int weight, int height, int age) {
        super(weight, height, age);
    }

    @Override
    public void traverse () {
        System.out.println("walk");
    }

}
