package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend

{

    private String friendName;
    private int friendAge;
    private String friendSex;

    public void initialize(String name)
    {
        friendName = name;
    }

    public void initialize(int age, String name)
    {
        friendName = name;
        friendAge = age;
    }

    public void initialize(String sex, int age, String name)
    {
        friendName = name;
        friendAge = age;
        friendSex = sex;
    }
}