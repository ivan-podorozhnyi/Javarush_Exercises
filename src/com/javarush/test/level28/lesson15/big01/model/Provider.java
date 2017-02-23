package com.javarush.test.level28.lesson15.big01.model;

/**
 * Created by Ivan on 26.10.2016.
 */
public class Provider
{
    private Strategy strategy;

    public Provider(Strategy strategy)
    {
        this.strategy = strategy;
    }
}
