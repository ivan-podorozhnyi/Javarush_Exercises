package com.javarush.test.level07.lesson06.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Ivan on 31.03.2016.
 */
public class test
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());


        }

        for (int i = 0; i < 13; i++)
        {
            String s = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, s);
        }


        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        //напишите тут ваш код

    }
}
