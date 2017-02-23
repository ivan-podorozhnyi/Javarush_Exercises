package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend

{

    private String friendName;
    private int friendAge;
    private String friendSex;

    public Friend(String name)
    {
        friendName = name;
    }

    public Friend(int age, String name)
    {
        friendName = name;
        friendAge = age;
    }

    public Friend(String sex, int age, String name)
    {
        friendName = name;
        friendAge = age;
        friendSex = sex;
    }
}