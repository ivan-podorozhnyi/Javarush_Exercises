package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String s = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "d";
        String s5 = "e";
        ArrayList<String> list = new ArrayList<String>();
        list.add(s);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        int n = list.size();
        System.out.println(n);
        for (int i = 0; i < list.size(); i++)
        {
            int j = list.size() - i - 1;
            System.out.println( list.get(j) );
        }




        //напишите тут ваш код

    }
}
