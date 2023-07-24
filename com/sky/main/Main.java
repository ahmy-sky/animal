package com.sky.main;

import com.sky.parent.Animal;
import com.sky.species.Mammals;

public class Main {

    public static void main(String[] args) {

        Animal elephant = new Mammals();
        elephant.setType("elephant");
        elephant.setAge(50);
        elephant.setHeight(3);
        elephant.setWeight(6000);

        System.out.println(elephant);
    }
}
