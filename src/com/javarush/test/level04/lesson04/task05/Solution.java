package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String numa = reader.readLine();
        int numa2 = Integer.parseInt(numa);
        if (numa2>0)
        {
            numa2 = numa2 * 2;
            System.out.println(numa2);
        }
        else
        {
            numa2= numa2 +1;
            System.out.println(numa2);
        }

    }

}