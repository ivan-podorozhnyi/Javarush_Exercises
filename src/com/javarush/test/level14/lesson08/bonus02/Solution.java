package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        int a = Integer.parseInt(reader.readLine());
        funk(a, b);


    }

    public static void funk(int a, int b)
    {
        if (a > b)
        {
            a = a - b;
        }
        else
        {
            b = b - a;
        }
        if (b == 0)
        {
            System.out.println(a);
            return;
        }
        funk(a, b);
    }
}
