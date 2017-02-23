package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog

{

    private String dogName;
    private int dogHeight;
    private String dogColor;

    public Dog(String name)
    {
        dogName = name;
    }

    public Dog(int height, String name)
    {
        dogName = name;
        dogHeight = height;
    }

    public Dog(String name, int height, String color)
    {
        dogName = name;
        dogHeight = height;
        dogColor = color;
    }
}
