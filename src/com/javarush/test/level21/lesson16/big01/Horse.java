package com.javarush.test.level21.lesson16.big01;

/**
 * Created by Ivan on 01.07.2016.
 */
public class Horse {
    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.distance=distance;
        this.name=name;
        this.speed=speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance=distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed=speed;
    }

    public void move() {
        this.distance += (int) this.speed * Math.random();

    }

    public void print() {
        String x = "";
        for (int i = 0; i < this.distance; i++) {
            x = x + ".";
        }
        System.out.println(x + this.name);

    }


}
