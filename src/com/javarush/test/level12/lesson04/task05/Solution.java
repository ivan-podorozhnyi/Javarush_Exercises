package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }
    public void max(int a, int b){
        a = 5;
        b = 6;
        int max = ((a < b)? a : b);

    }
    public void max(long b, long a){
        a = 5;
        a = 6;
        long max = ((a < b)? a : b);

    }
    public void max(double a, double b){
        a = 5;
        a = 6;
        double max = ((a < b)? a : b);

    }

    //Напишите тут ваши методы
}
