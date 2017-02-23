package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution
{


    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put( 1.1, "11" );
        labels.put( 2.2, "22" );
        labels.put( 3.3, "33" );
        labels.put( 4.4, "44" );
        labels.put( 5.5, "55" );
    }

    public static void main(String[] args)
    {
        System.out.println(labels);
    }
}
