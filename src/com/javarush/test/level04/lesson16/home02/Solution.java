package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > b && a < c)||(a>c &&a<b))
            System.out.println(a);
        else if ((c > b && c < a)||(c>a &&c<b))
            System.out.println(c);
        else System.out.println(b);


        //напишите тут ваш код
    }
}
