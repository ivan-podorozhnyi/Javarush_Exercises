package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Ivan on 25.04.2016.
 */
public class Computer
{
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer()
    {
        keyboard = new Keyboard();
        mouse = new Mouse();
        monitor = new Monitor();
    }

    public Mouse getMouse()
    {
        return mouse;
    }

    public Monitor getMonitor()
    {

        return monitor;
    }

    public Keyboard getKeyboard()
    {

        return keyboard;
    }
}
