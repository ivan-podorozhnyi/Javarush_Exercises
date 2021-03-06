package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> a = new ArrayList<int[]>();
        a.add(new int[] { 1, 2, 3, 1, 1 });
        a.add(new int[]{ 4, 5 });
        a.add(new int[]{ 7, 8, 9, 1 });
        a.add(new int[]{ 4, 5, 6, 1, 1, 1, 1 });
        a.add(new int[]{});

        return a;//напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
