package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String d = reader.readLine();
        String m = reader.readLine();
        String y = reader.readLine();
        int D = Integer.parseInt(d);
        int M = Integer.parseInt(m);
        int Y = Integer.parseInt(y);
        System.out.println("Меня зовут "+ name);
        System.out.println("Я родился "+Y+"."+M+"."+D);
        //напишите тут ваш код
    }
}
