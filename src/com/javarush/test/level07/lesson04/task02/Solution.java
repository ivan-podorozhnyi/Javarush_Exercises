package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = s;
        }

//вывод содержимого массива на экран
        for (int i = 0; i < list.length; i++)
        {
            int j = list.length - i - 1;
            System.out.println( list[j] );
        }//напишите тут ваш код

    }
}