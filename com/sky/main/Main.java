package com.sky.main;

import com.sky.parent.Animal;
import com.sky.species.Mammals;

public class Main {

    public static void main(String[] args) {
        Animal elephant = new Mammals(6000, 3, 50);
        elephant.setType("elephant");

        System.out.println(elephant);
    }
}
