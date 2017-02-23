package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > a && b > c && b > d)
            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else
            System.out.println(d);
        //напишите тут ваш код

    }
}
