package com.javarush.test.level03.lesson08.task04;

import java.util.Arrays;

/**
 * Created by Ivan on 22.03.2016.
 */
public class test2
{
    public static void main(String[] args)
    {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {6, 8, 3, 123, 4, 1, 32, 23},};

        for (int[] arr : data)
        {
            System.out.print(Arrays.toString(arr) + " -> ");
            BubbleSorter_a.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

