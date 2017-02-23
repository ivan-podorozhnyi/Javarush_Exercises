package com.javarush.test.level05.lesson12.home05;

import java.util.Scanner;

public class Scan


{
    public static void main(String[] args) throws Exception
    {

        int d = 0;
        Scanner sc = new Scanner(System.in);
        while (true)

        {

            String a = sc.nextLine();
            if (a.equals("сумма")) break;
            int b = Integer.parseInt(a);
            d +=b;
        }
        System.out.print(d);//напишите тут ваш код
    }
}
