package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {



        ArrayList<String> list = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            String s = scanner.nextLine();
            list.add(s);
        }

        //Считать строки с консоли и объявить ArrayList list тут

        ArrayList<String> result = doubleValues(list);
        for (String s : result){
            System.out.println(s);

        }}

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for(int i = 0; i < list.size(); i+=2 )
        {
            list.add(i, list.get(i));

        }//напишите тут ваш код
        return list;
    }
}
