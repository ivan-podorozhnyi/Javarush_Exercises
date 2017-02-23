package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Olga", new Date("JULY 1 1980"));
        map.put("Ivan", new Date("JUNE 1 1980"));
        map.put("Papa", new Date("SEPTEMBER 1 1980"));
        map.put("Mama", new Date("JUNE 1 1980"));
        map.put("Kot", new Date("JUNE 1 1980"));
        map.put("Sobaka", new Date("JUNE 1 1980"));
        map.put("Enot", new Date("NOVEMBER 1 1980"));
        map.put("Sestra", new Date("JUNE 1 1980"));
        map.put("Baba", new Date("DECEMBER 1 1980"));

        return map;//напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {



        for(Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, Date> pair = it.next();
            if(pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                it.remove();
            }
        }
        //напишите тут ваш код

    }
}
