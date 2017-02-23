package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int d = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)

        {
            String a = reader.readLine();
            if (a.equals("сумма")) break;
            int b = Integer.parseInt(a);
            d +=b;
        }
        System.out.print(d);//напишите тут ваш код
    }
}
