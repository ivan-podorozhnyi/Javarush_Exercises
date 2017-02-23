package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String[] catNames = {"Васька", "Барсик", "Мурзик"};
            catNames[3] = "Рыжик";

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int [] a = new int[-1];
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }



        try
        {
            LinkedList list = new LinkedList();
            list.get(-1);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object x = new Integer(0);
            System.out.println((String)x);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }



        try
        {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');
        }

        catch (Exception e)
        {
            exceptions.add(e);
        }



        try
        {
            int[] Array = new int[5];
            Array = null;
            int i = Array.length;
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }



        try
        {
            String String = "123";
            char chr = String.charAt(10);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String s = "lalala";
            int i = Integer.parseInt(s);
            // this line of code will never be reached
            System.out.println("int value = " + i);
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }

        try {


            throw new IllegalStateException("MyException");

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }





        //Add your code here

    }
}
