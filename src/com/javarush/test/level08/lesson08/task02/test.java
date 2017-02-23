package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Ivan on 24.02.2016.
 */
public class test
{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++)
            set.add(i);


        for (Integer text : set)
        {
            System.out.println(text);
        }





}

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {

        for (Integer text : set){
            if (text > 10){
                set.remove(text);
            }
            else set.add(text);


        }
        return set;
}}
