package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog

{

    private String dogName;
    private int dogHeight;
    private String dogColor;

    public void initialize(String name)
    {
        dogName = name;
    }

    public void initialize(int height, String name)
    {
        dogName = name;
        dogHeight = height;
    }

    public void initialize(String name, int height, String color)
    {
        dogName = name;
        dogHeight = height;
        dogColor = color;
    }
}
