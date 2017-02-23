package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Ivan on 26.04.2016.
 */
public class Plane implements Flyable {


    @Override
    public void fly() {

    }
    int passengers;

    public Plane(int passengers) {
        this.passengers=passengers;
    }
}
