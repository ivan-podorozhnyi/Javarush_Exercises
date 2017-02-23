package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Ivan on 26.04.2016.
 */
public class Singleton
{
    private static volatile Singleton instance;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            synchronized (Singleton.class)
            {
                if (instance == null) instance = new Singleton();
            }
        return instance;
    }



}
