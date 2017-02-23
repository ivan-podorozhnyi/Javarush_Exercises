package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Mama");
        map.put("2", "Mila-Mila");
        map.put("3", "Ramu");
        map.put("4", "Mama-Mama");
        map.put("5", "Mama");
        map.put("6", "Ramu");
        map.put("7", "Mama-Mama");
        map.put("8", "Mama-Mama");
        map.put("9", "Mama-Mama");
        map.put("10", "Mama");

        return map;//напишите тут ваш код

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;
        for (String tmp : map.values())
        {
            if(name.equals(tmp))
            {
                count++;
            }
        }
        return count;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        return map.containsKey(lastName) ? 1 : 0;//напишите тут ваш код

    }
}
