package com.javarush.test.level03.lesson08.task04;

/**
 * Created by Ivan on 21.03.2016.
 */
public class test
{
    public static void main(String[] args)
    {
        for (int i = 1; i < 11; i++)
        {
            for (int j = 1; j < 11; j++)
            {
                int k = i * j;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
