package com.sky.species;

import com.sky.parent.Animal;

public class Avian extends Animal {

    public double wingspan;

    public Avian(int weight, int height, int age) {
        super(weight, height, age);
    }

    @Override
    public void traverse () {
        System.out.println("Fly");
    }
}
