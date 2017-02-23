package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public void min(int a, int b){
        a = 5;
        b = 6;
        int max = ((a > b)? a : b);

    }
    public void min(long b, long a){
        a = 5;
        a = 6;
        long max = ((a > b)? a : b);

    }
    public void min(double a, double b){
        a = 5;
        a = 6;
        double max = ((a > b)? a : b);

    }
    //Напишите тут ваши методы
}
